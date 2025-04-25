# Instrucciones para ejecutar el Conversor de Moneda en Visual Studio Code

## Configuración del proyecto en VS Code

1. **Instalar las extensiones necesarias**:
   - Abre VS Code
   - Ve a la pestaña de extensiones (Ctrl+Shift+X)
   - Busca e instala "Extension Pack for Java" de Microsoft

2. **Abrir el proyecto**:
   - Selecciona `File > Open Folder...`
   - Navega al directorio del proyecto y selecciónalo

3. **Verificar la configuración**:
   - Los archivos de configuración `.vscode/launch.json`, `.vscode/tasks.json` y `.vscode/settings.json` ya están configurados
   - Estos archivos aseguran que VS Code pueda encontrar todas las dependencias necesarias

## Ejecutar el programa

### Opción 1: Usar el depurador de VS Code

1. Abre el archivo `src/Main/ConversorDeMoneda.java`
2. Haz clic en el botón "Run and Debug" en la barra lateral izquierda (o presiona F5)
3. Selecciona "Ejecutar Conversor de Moneda" de la lista desplegable

### Opción 2: Usar las tareas de VS Code

1. Presiona `Ctrl+Shift+P` para abrir la paleta de comandos
2. Escribe "Tasks: Run Task" y selecciónalo
3. Elige "Ejecutar Conversor de Moneda"

### Opción 3: Usar el script batch

1. Haz doble clic en `ejecutar_vscode.bat` en el explorador de archivos de Windows

### Opción 4: Usar la terminal integrada

1. Abre la terminal integrada en VS Code (Ctrl+`)
2. Ejecuta:
   ```
   javac -classpath "lib/json-20231013.jar;." src/Main/*.java
   java -classpath "lib/json-20231013.jar;src;." Main.ConversorDeMoneda
   ```

## Solución de problemas

### Error: ClassNotFoundException

Si recibes el error `ClassNotFoundException: ConversorDeMoneda` o `ClassNotFoundException: Main.ConversorDeMoneda`, significa que VS Code no puede encontrar la clase en el classpath. Prueba lo siguiente:

1. Asegúrate de que la estructura del proyecto sea correcta:
   - `src/Main/ConversorDeMoneda.java`: Clase principal
   - `src/Main/ConversionMoneda.java`: Lógica de conversión
   - `lib/json-20231013.jar`: Biblioteca JSON

2. Verifica que el archivo JAR de JSON exista:
   - Asegúrate de que el archivo `lib/json-20231013.jar` existe
   - Si no existe, ejecuta `ejecutar_vscode.bat` que descargará la biblioteca automáticamente

3. Reconstruye el proyecto:
   - Presiona `Ctrl+Shift+P`
   - Escribe "Java: Clean Java Language Server Workspace" y selecciónalo
   - Selecciona "Restart and delete" cuando se te pregunte

### Error: NoClassDefFoundError

Si recibes el error `NoClassDefFoundError: org/json/JSONObject`, significa que VS Code no puede encontrar la biblioteca JSON. Asegúrate de que:

1. El archivo `lib/json-20231013.jar` existe
2. La configuración en `.vscode/settings.json` incluye la referencia a la biblioteca

## Notas adicionales

- Si modificas el código, VS Code debería compilarlo automáticamente
- Si tienes problemas con la compilación automática, puedes compilar manualmente usando la tarea "Compilar Conversor de Moneda"
- Si nada funciona, cierra VS Code, abre una terminal y ejecuta `ejecutar_vscode.bat`
