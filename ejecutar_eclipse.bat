@echo off
echo Ejecutando Conversor de Moneda para Eclipse...
echo.
echo Este script compila y ejecuta el programa con la configuración correcta para Eclipse.
echo.

echo Compilando el código...
javac -classpath "lib/json-20231013.jar;." src/Main/*.java src/ConversorDeMonedaApp.java

echo.
echo Ejecutando el programa...
java -classpath "lib/json-20231013.jar;src;." ConversorDeMonedaApp

pause
