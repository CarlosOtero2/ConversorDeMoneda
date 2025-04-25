# Instrucciones para subir el proyecto a GitHub

Sigue estos pasos para subir el proyecto a tu repositorio de GitHub:

1. Abre una terminal o línea de comandos en el directorio del proyecto.

2. Inicializa un repositorio Git (si aún no lo has hecho):
   ```
   git init
   ```

3. Configura tu identidad de Git (si aún no lo has hecho):
   ```
   git config --global user.email "tu_email@example.com"
   git config --global user.name "Tu Nombre"
   ```

4. Agrega todos los archivos al área de preparación:
   ```
   git add .
   ```

5. Realiza el primer commit:
   ```
   git commit -m "Primer commit: Conversor de Moneda funcional con documentación"
   ```

6. Agrega el repositorio remoto:
   ```
   git remote add origin https://github.com/CarlosOtero2/ConversorDeMoneda.git
   ```

7. Sube los cambios al repositorio remoto:
   ```
   git push -u origin master
   ```
   o si estás usando la rama principal como 'main':
   ```
   git push -u origin main
   ```

8. Ingresa tus credenciales de GitHub cuando se te solicite.

## Estructura de archivos a subir

Asegúrate de que los siguientes archivos y directorios estén incluidos en tu repositorio:

- `src/`: Directorio con el código fuente
  - `Main/`: Paquete principal
    - `ConversorDeMoneda.java`: Clase principal
    - `ConversionMoneda.java`: Lógica de conversión
    - `Utilidades.java`: Métodos de utilidad
    - `OpcionesMenu.java`: Constantes del menú
- `lib/`: Directorio con las bibliotecas
  - `json-20231013.jar`: Biblioteca JSON
- `README.md`: Documentación principal
- `.gitignore`: Archivos a ignorar

## Notas importantes

- Asegúrate de no incluir información sensible como claves de API en el repositorio.
- Si tienes problemas con Git, puedes usar la interfaz web de GitHub para subir los archivos manualmente.
- Recuerda actualizar la documentación si realizas cambios en el proyecto.
