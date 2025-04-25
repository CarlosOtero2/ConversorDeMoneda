package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    // Método para mostrar el encabezado de la aplicación
    public static void mostrarEncabezado() {
        System.out.println("========================================");
        System.out.println("        Conversor de Moneda");
        System.out.println("      Desarrollado por: Carlos I. Otero E. "); // Reemplazar con tu nombre
        System.out.println("             Panamá");             // Reemplazar con tu país
        System.out.println("========================================");
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("Opciones de conversión:");
        System.out.println(OpcionesMenu.CONVERTIR_USD_EUR + ". Convertir USD a EUR");
        System.out.println(OpcionesMenu.CONVERTIR_USD_GBP + ". Convertir USD a GBP");
        System.out.println(OpcionesMenu.CONVERTIR_USD_JPY + ". Convertir USD a JPY");
        System.out.println(OpcionesMenu.CONVERTIR_EUR_USD + ". Convertir EUR a USD");
        System.out.println(OpcionesMenu.CONVERTIR_GBP_USD + ". Convertir GBP a USD");
        System.out.println(OpcionesMenu.CONVERTIR_JPY_USD + ". Convertir JPY a USD");
        System.out.println(OpcionesMenu.SALIR + ". Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    // Método para obtener la opción del usuario con validación
    public static int obtenerOpcion(Scanner scanner) {
        while (true) {
            try {
                // Leer la línea completa y convertirla a entero
                String input = scanner.nextLine().trim();
                try {
                    int opcion = Integer.parseInt(input);
                    return opcion;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    System.out.print("Ingrese la opción deseada: "); //Vuelve a preguntar
                }
            } catch (Exception e) {
                System.out.println("Error al leer la entrada: " + e.getMessage());
                System.out.print("Ingrese la opción deseada: "); //Vuelve a preguntar
                scanner.nextLine(); // Intenta limpiar el buffer
            }
        }
    }

    // Método para obtener la cantidad a convertir con validación
    public static double obtenerCantidad(Scanner scanner) {
        while (true) {
            try {
                // Leer la línea completa y convertirla a double
                String input = scanner.nextLine().trim();
                try {
                    double cantidad = Double.parseDouble(input);
                    if (cantidad < 0) {
                        System.out.println("La cantidad debe ser un número positivo.");
                        System.out.print("Ingrese la cantidad: ");
                    } else {
                        return cantidad;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                    System.out.print("Ingrese la cantidad: "); // Pide la cantidad de nuevo
                }
            } catch (Exception e) {
                System.out.println("Error al leer la entrada: " + e.getMessage());
                System.out.print("Ingrese la cantidad: "); // Pide la cantidad de nuevo
                scanner.nextLine(); // Intenta limpiar el buffer
            }
        }
    }
}
