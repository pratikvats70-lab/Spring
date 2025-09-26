@echo off
echo Starting WSDL2Java and XSD2Java code generation...
echo.

echo Cleaning previous generated sources...
gradlew clean

echo.
echo Generating sources from WSDL and XSD files...
gradlew generateSources

echo.
echo Compiling project...
gradlew compileJava

echo.
echo Generation completed! Check the following directories:
echo - build/generated-sources/wsdl2java (WSDL-generated classes)
echo - build/generated-sources/xjc (XSD-generated classes)
echo.

pause