# Teradata-SQL-Parser
This is a grammar and some supporting code for parsing out Teradata SQL queries. <b>This is very much a work in progress.</b> Lots of work needs to be done before this is viable.

This grammar is being built for Teradata 14.10 syntax by using the "SQL Quick Reference" PDF found at http://www.info.teradata.com

### Currently Supports
- Most SELECT statements (certain uncommon parts excluded)
- Most INSERT & INSERT/SELECT statements

### To Build
Follow ANTLR quick start instructions at http://www.antlr.org/ ... nothing too special. This utilizes ANTLR 4.5.3. Copying instructions here in case they change in a future version...

#### OS X
$ cd /usr/local/lib  
$ sudo curl -O http://www.antlr.org/download/antlr-4.5.3-complete.jar  
$ export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"  
$ alias antlr4='java -jar /usr/local/lib/antlr-4.5.3-complete.jar'  
$ alias grun='java org.antlr.v4.gui.TestRig'  

#### LINUX
$ cd /usr/local/lib
$ wget http://www.antlr.org/download/antlr-4.5.3-complete.jar  
$ export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"  
$ alias antlr4='java -jar /usr/local/lib/antlr-4.5.3-complete.jar'  
$ alias grun='java org.antlr.v4.gui.TestRig'  

#### Windows
Download http://antlr.org/download/antlr-4.5.3-complete.jar.  
Add antlr4-complete.jar to CLASSPATH, either:  
Permanently: Using System Properties dialog > Environment variables > Create  or append to CLASSPATH variable  
Temporarily, at command line:  
SET CLASSPATH=.;C:\Javalib\antlr4-complete.jar;%CLASSPATH%  
Create batch commands for ANTLR Tool, TestRig in dir in PATH  
 antlr4.bat: java org.antlr.v4.Tool %*  
 grun.bat:   java org.antlr.v4.gui.TestRig %*  