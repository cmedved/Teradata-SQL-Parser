package us.shadowlabs.tdparser;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Trees;
import us.shadowlabs.tdparser.antlr.TeradataBaseListener;
import us.shadowlabs.tdparser.antlr.TeradataParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Listens in during the parsing.
 * @author Christopher Medved
 */
public class TeradataTreeListener extends TeradataBaseListener {
    private final StringBuilder builder = new StringBuilder();
    private ObjectTracker tracker;

    private boolean inSelect = false;
    private List<String> lastSelectAlias = null;

    public TeradataTreeListener() {
        tracker = new ObjectTracker();
        lastSelectAlias = new ArrayList<>();
    }

    public StringBuilder printColumns(StringBuilder builder) {
        List<ObjectTracker.ObjectInfo> columns = tracker.getRootColumns();
        builder.append(System.lineSeparator()).append("Column Results ----------------------------").append(System.lineSeparator());
        for (ObjectTracker.ObjectInfo col : columns) {
            builder.append(tracker.resolveTableAlias(col.getColumnName(),col.getTableName())).append(System.lineSeparator());
        }
        return builder;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
//        if (builder.length() > 0) {
//            builder.append(' ');
//        }
//
//        builder.append("t: " + Utils.escapeWhitespace(Trees.getNodeText(node, ruleNames), false));
//        builder.append(System.lineSeparator());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
//        if (builder.length() > 0) {
//            builder.append(' ');
//        }
//
//        builder.append(Utils.escapeWhitespace(Trees.getNodeText(node, ruleNames), false));
//        builder.append(System.lineSeparator());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
//        int ruleIndex = ctx.getRuleIndex();
//        String ruleName;
//        if (ruleIndex >= 0 && ruleIndex < ruleNames.size()) {
//            ruleName = ruleNames.get(ruleIndex);
//        }
//        else {
//            ruleName = Integer.toString(ruleIndex);
//        }
//
//        builder.append(ruleName + " ");
//        builder.append(System.lineSeparator());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public String toString() {
        builder.append(tracker).append(System.lineSeparator());
        printColumns(builder);
        return builder.toString();
    }

    public List<ObjectTracker.ObjectInfo> getColumns() {
        return tracker.getRootColumns();
    }

    public List<ObjectTracker.ObjectInfo> getResolvedColumns() {
        List<ObjectTracker.ObjectInfo> resolvedCols = new ArrayList<>();
        for (ObjectTracker.ObjectInfo col : tracker.getRootColumns()) {
            List<ObjectTracker.ObjectInfo> resolvedCol = tracker.resolveTableAlias(col.getColumnName(),col.getTableName());
            if (resolvedCol != null) resolvedCols.addAll(resolvedCol);
            else System.err.println("WARN: got a null resolved col for: "+col.getTableName()+"."+col.getColumnName());
        }
        return resolvedCols;
    }

    public List<ObjectTracker.ObjectInfo> getTables() {
        return tracker.getRootTables();
    }

    public ObjectTracker getTracker() {
        return tracker;
    }

    @Override
    public void exitFrom_single_expr(TeradataParser.From_single_exprContext ctx) {
        String databaseName=null,tableName,aliasName=null;
        TeradataParser.Table_nameContext tblCtx = ctx.table_name();
        TeradataParser.Database_nameContext dbCtx = tblCtx.database_name();
        TeradataParser.Correlation_nameContext aliasCtx = ctx.correlation_name();
        if (dbCtx != null) {
            databaseName = dbCtx.IDENTIFIER().getText();
        }
        tableName = tblCtx.IDENTIFIER().getText();
        if (aliasCtx != null) {
            aliasName = aliasCtx.IDENTIFIER().getText();
        }
        tracker.addObject(databaseName,tableName,null,aliasName);
    }

    @Override
    public void enterSelect_list(TeradataParser.Select_listContext ctx) {
//        builder.append("Entering select list...");
//        builder.append(System.lineSeparator());
        inSelect = true;
    }

    @Override
    public void exitSelect_list(TeradataParser.Select_listContext ctx) {
//        builder.append("Exiting select list...");
//        builder.append(System.lineSeparator());
        inSelect = false;
        if (ctx.STAR() != null)
            tracker.addObject(null,null,"*",null);
    }


    @Override
    public void exitColumn_name(TeradataParser.Column_nameContext ctx) {
        String tableName = null;
        String columnName = ctx.IDENTIFIER().getText();
        String databaseName = null;
        if (ctx.table_name() != null) {
            tableName = ctx.table_name().IDENTIFIER().getText();
            if (ctx.table_name().database_name() != null) {
                databaseName = ctx.table_name().database_name().IDENTIFIER().getText();
            }
        }
        tracker.addObject(databaseName,tableName,columnName,null);
    }

    @Override
    public void enterFrom_derived_expr(TeradataParser.From_derived_exprContext ctx) {
        tracker.enterScope();
    }

    @Override
    public void exitFrom_derived_expr(TeradataParser.From_derived_exprContext ctx) {
        String derivedName = ctx.derived_table_name().getText();
        tracker.exitScope(derivedName);
    }

    @Override
    public void exitSelect_list_expr(TeradataParser.Select_list_exprContext ctx) {
        if (ctx.STAR() != null) {
            tracker.addObject(null,ctx.table_name().IDENTIFIER().getText(),"*",null);
            return;
        }
        String alias = null;
        if (ctx.expr_alias_name() != null) {
            alias = ctx.expr_alias_name().IDENTIFIER().getText();
        }
        addColumnsFromSelectList(ctx,alias);
    }

    private void addColumnsFromSelectList(ParserRuleContext ctx,String aliasName) {
        int childCount = ctx.getChildCount();
        int i = 0;
        while (i < childCount) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TeradataParser.Column_nameContext) {
                TeradataParser.Column_nameContext childCtx = (TeradataParser.Column_nameContext) child;
                String databaseName=null,tableName=null,columnName=childCtx.IDENTIFIER().getText();
                TeradataParser.Table_nameContext tableCtx = childCtx.table_name();
                TeradataParser.Database_nameContext dbCtx = null;
                if (tableCtx != null) {
                    dbCtx = tableCtx.database_name();
                }
                if (tableCtx != null) tableName = tableCtx.IDENTIFIER().getText();
                if (dbCtx != null) databaseName = dbCtx.IDENTIFIER().getText();
                tracker.addObject(databaseName,tableName,columnName,aliasName);
            }
            if (child instanceof ParserRuleContext) {
                ParserRuleContext childCtx = (ParserRuleContext) child;
                addColumnsFromSelectList(childCtx,aliasName);
            }
            i++;
        }
    }

    @Override
    public void enterSubquery(TeradataParser.SubqueryContext ctx) {
        if (ctx.getParent() instanceof TeradataParser.ExprContext) {
            tracker.enterScope();
        }
    }

    @Override
    public void exitSubquery(TeradataParser.SubqueryContext ctx) {
        if (ctx.getParent() instanceof TeradataParser.ExprContext) {
            tracker.exitScope(null);
        }
    }
}