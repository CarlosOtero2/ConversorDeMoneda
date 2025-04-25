# Conversor de Moneda

## Descripción
Este proyecto es un conversor de moneda desarrollado en Java que permite realizar conversiones entre diferentes divisas utilizando la API de ExchangeRate-API. El programa ofrece una interfaz de consola sencilla para realizar conversiones entre USD, EUR, GBP y JPY.

## Desarrollador
- **Nombre:** Carlos I. Otero E.
- **País:** Panamá

## Características
- Conversión de USD a EUR, GBP y JPY
- Conversión de EUR, GBP y JPY a USD
- Interfaz de consola fácil de usar
- Validación de entrada de datos
- Manejo de errores detallado
- Caché de tipos de cambio para mejorar el rendimiento

## Tecnologías utilizadas
- Java
- ExchangeRate-API para obtener los tipos de cambio en tiempo real
- Biblioteca org.json para el procesamiento de JSON

## Requisitos
- Java 11 o superior
- Conexión a Internet para obtener los tipos de cambio
- Clave de API de ExchangeRate-API

## Instalación
1. Clona este repositorio:
   ```
   git clone https://github.com/CarlosOtero2/ConversorDeMoneda.git
   ```
2. Navega al directorio del proyecto:
   ```
   cd ConversorDeMoneda
   ```
3. Compila el proyecto:
   ```
   javac -classpath "lib/json-20231013.jar;." src/Main/*.java
   ```

## Uso
Hay varias formas de ejecutar el programa:

### Usando los scripts batch (recomendado)
1. Ejecuta el archivo `ejecutar_principal.bat` haciendo doble clic en él.
2. Sigue las instrucciones en pantalla para realizar conversiones de moneda.

### Usando la línea de comandos
1. Abre una terminal en el directorio del proyecto.
2. Ejecuta el programa con el siguiente comando:
   ```
   java -classpath ".;lib/json-20231013.jar;src" Main.ConversorDeMoneda
   ```
3. Sigue las instrucciones en pantalla para realizar conversiones de moneda.

### Usando el archivo JAR (opcional)
1. Crea el archivo JAR ejecutando `crear_jar.bat`.
2. Ejecuta el JAR con `ejecutar_jar.bat` o con el siguiente comando:
   ```
   java -jar ConversorDeMoneda.jar
   ```

## Estructura del proyecto
- `src/Main/ConversorDeMoneda.java`: Clase principal que contiene el método main.
- `src/Main/ConversionMoneda.java`: Clase que maneja la lógica de conversión de moneda y la comunicación con la API.
- `src/Main/Utilidades.java`: Clase con métodos de utilidad para la interfaz de usuario y validación de entrada.
- `src/Main/OpcionesMenu.java`: Clase con constantes para las opciones del menú.
- `lib/json-20231013.jar`: Biblioteca para el procesamiento de JSON.

## Licencia
Este proyecto está bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.

## Agradecimientos
- [ExchangeRate-API](https://www.exchangerate-api.com/) por proporcionar la API para obtener los tipos de cambio.
- Alura Latam y Oracle por el programa ONE (Oracle Next Education).
