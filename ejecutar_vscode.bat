@echo off
echo Ejecutando Conversor de Moneda para Visual Studio Code...
echo.
echo Este script compila y ejecuta el programa con la configuración correcta para VS Code.
echo.

echo Compilando el código...
javac -classpath "lib/json-20231013.jar;." src/Main/*.java

echo.
echo Ejecutando el programa...
java -classpath "lib/json-20231013.jar;src;." Main.ConversorDeMoneda

pause
