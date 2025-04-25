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
  ![image](https://github.com/user-attachments/assets/cd2036ec-1bbe-47ab-873a-f3a7be682eb9)
  ![image](https://github.com/user-attachments/assets/f455df63-81d9-4e40-afbb-a28270c69d67)
  ![image](https://github.com/user-attachments/assets/6ab96d7e-6270-481b-97fd-b8aa248e1991)




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
1. Ejecuta el programa:
   ```
   java -classpath "lib/json-20231013.jar;src" Main.ConversorDeMoneda
   ```
2. Sigue las instrucciones en pantalla para realizar conversiones de moneda.

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
