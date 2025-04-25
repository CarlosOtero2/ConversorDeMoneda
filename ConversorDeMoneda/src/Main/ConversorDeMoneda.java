package Main;

import java.util.Scanner;

public class ConversorDeMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Mostrar el encabezado
        Utilidades.mostrarEncabezado();

        // Bucle principal del programa
        do {
            // Mostrar el menú de opciones
            Utilidades.mostrarMenu();
            opcion = Utilidades.obtenerOpcion(scanner);

            // Realizar la conversión según la opción seleccionada
            switch (opcion) {
                case OpcionesMenu.CONVERTIR_USD_EUR:
                    ConversionMoneda.convertirMoneda("USD", "EUR", scanner);
                    break;
                case OpcionesMenu.CONVERTIR_USD_GBP:
                    ConversionMoneda.convertirMoneda("USD", "GBP", scanner);
                    break;
                case OpcionesMenu.CONVERTIR_USD_JPY:
                    ConversionMoneda.convertirMoneda("USD", "JPY", scanner);
                    break;
                case OpcionesMenu.CONVERTIR_EUR_USD:
                    ConversionMoneda.convertirMoneda("EUR", "USD", scanner);
                    break;
                case OpcionesMenu.CONVERTIR_GBP_USD:
                    ConversionMoneda.convertirMoneda("GBP", "USD", scanner);
                    break;
                case OpcionesMenu.CONVERTIR_JPY_USD:
                    ConversionMoneda.convertirMoneda("JPY", "USD", scanner);
                    break;
                case OpcionesMenu.SALIR:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != OpcionesMenu.SALIR);

        scanner.close();
    }
}
