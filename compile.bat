@echo off
echo Compiling Prison Management System...

if not exist out\production mkdir out\production

set PATH_TO_FX=C:\javafx-sdk-25.0.1\lib
set SQLITE_JAR=D:\PrisonManagementSystem\lib\sqlite-jdbc-3.44.1.0.jar
set SLF4J_API=D:\PrisonManagementSystem\lib\slf4j-api-2.0.9.jar
set SLF4J_SIMPLE=D:\PrisonManagementSystem\lib\slf4j-simple-2.0.9.jar

javac -d out\production ^
    --module-path %PATH_TO_FX% ^
    --add-modules javafx.controls,javafx.fxml ^
    -cp "%SQLITE_JAR%;%SLF4J_API%;%SLF4J_SIMPLE%" ^
    -sourcepath src\main\java ^
    src\main\java\com\prison\*.java ^
    src\main\java\com\prison\model\*.java ^
    src\main\java\com\prison\controller\*.java ^
    src\main\java\com\prison\util\*.java

if %ERRORLEVEL% EQU 0 (
    if not exist out\production\fxml mkdir out\production\fxml
    xcopy /Y /E src\main\resources\fxml\* out\production\fxml\
    echo.
    echo Compilation complete!
    echo To run the application, use: run.bat
) else (
    echo.
    echo Compilation FAILED!
    echo Check the errors above.
)

pause