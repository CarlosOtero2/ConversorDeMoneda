# Instrucciones para ejecutar el Conversor de Moneda en Eclipse

## Configuración del proyecto en Eclipse

1. **Importar el proyecto**:
   - En Eclipse, selecciona `File > Import...`
   - Elige `General > Existing Projects into Workspace`
   - Selecciona el directorio raíz del proyecto
   - Haz clic en `Finish`

2. **Verificar el classpath**:
   - Haz clic derecho en el proyecto
   - Selecciona `Properties > Java Build Path > Libraries`
   - Verifica que `lib/json-20231013.jar` esté en la lista
   - Si no está, haz clic en `Add External JARs...` y selecciona `lib/json-20231013.jar`
   - Haz clic en `Apply and Close`

## Ejecutar el programa

### Opción 1: Ejecutar ConversorDeMonedaApp

1. Abre `src/ConversorDeMonedaApp.java`
2. Haz clic derecho en el archivo
3. Selecciona `Run As > Java Application`

Esta clase está diseñada específicamente para ejecutarse desde Eclipse y redirigirá al programa principal.

### Opción 2: Ejecutar desde la línea de comandos

Si tienes problemas para ejecutar el programa desde Eclipse, puedes ejecutarlo desde la línea de comandos:

1. Abre una terminal en el directorio del proyecto
2. Ejecuta:
   ```
   java -classpath ".;lib/json-20231013.jar;src" Main.ConversorDeMoneda
   ```
   
### Opción 3: Usar los scripts batch

1. Haz doble clic en `ejecutar_principal.bat` en el explorador de archivos de Windows

## Solución de problemas

### Error: ClassNotFoundException

Si recibes el error `ClassNotFoundException: ConversorDeMoneda`, significa que Eclipse no puede encontrar la clase en el classpath. Prueba lo siguiente:

1. Verifica que el archivo JAR de JSON esté correctamente agregado al classpath
2. Asegúrate de que la estructura del proyecto sea correcta:
   - `src/Main/ConversorDeMoneda.java`: Clase principal
   - `src/Main/ConversionMoneda.java`: Lógica de conversión
   - `lib/json-20231013.jar`: Biblioteca JSON

### Error: NoClassDefFoundError

Si recibes el error `NoClassDefFoundError: org/json/JSONObject`, significa que Eclipse no puede encontrar la biblioteca JSON. Asegúrate de que:

1. El archivo `lib/json-20231013.jar` existe
2. El archivo JAR está correctamente agregado al classpath

## Notas adicionales

- Si modificas el código, asegúrate de compilar todo el proyecto antes de ejecutarlo
- Si sigues teniendo problemas, intenta limpiar el proyecto: `Project > Clean...`
- Si nada funciona, cierra Eclipse, abre una terminal y ejecuta el programa desde la línea de comandos
