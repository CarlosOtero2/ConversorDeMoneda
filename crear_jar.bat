@echo off
echo Creando archivo JAR...
jar cfm ConversorDeMoneda.jar MANIFEST.MF ConversorDeMoneda.class src lib
echo Archivo JAR creado: ConversorDeMoneda.jar
echo Para ejecutar el JAR, use: java -jar ConversorDeMoneda.jar
pause
