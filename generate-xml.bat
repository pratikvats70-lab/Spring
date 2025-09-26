@echo off
set JAVA_HOME=C:\Program Files\jdk-23.0.2
set XJC_CP="%JAVA_HOME%\lib\jaxb-xjc.jar"
set OUTPUT_DIR=build\generated-sources\jaxb

mkdir %OUTPUT_DIR%

"%JAVA_HOME%\bin\java" -cp %XJC_CP% com.sun.tools.xjc.XJCFacade -d %OUTPUT_DIR% -p com.example.generated src/main/resources/xsd/data.xsd
