@echo off
echo Running Prison Management System...
echo.

set PATH_TO_FX=C:\javafx-sdk-25.0.1\lib
set SQLITE_JAR=D:\PrisonManagementSystem\lib\sqlite-jdbc-3.44.1.0.jar
set SLF4J_API=D:\PrisonManagementSystem\lib\slf4j-api-2.0.9.jar
set SLF4J_SIMPLE=D:\PrisonManagementSystem\lib\slf4j-simple-2.0.9.jar

if not exist out\production\com\prison\PrisonManagementApp.class (
    echo Error: Application not compiled!
    echo Please run compile.bat first.
    pause
    exit /b
)

java --module-path %PATH_TO_FX% ^
     --add-modules javafx.controls,javafx.fxml ^
     -cp "out\production;%SQLITE_JAR%;%SLF4J_API%;%SLF4J_SIMPLE%" ^
     com.prison.PrisonManagementApp

pause