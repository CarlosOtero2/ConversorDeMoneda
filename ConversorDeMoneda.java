/**
 * Clase principal del Conversor de Moneda.
 * Esta clase puede ejecutar directamente la lógica del conversor o redirigir al programa principal.
 */
import java.io.File;
import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        System.out.println("Iniciando Conversor de Moneda...");

        // Verificar si podemos ejecutar el programa principal
        try {
            // Verificar si la clase Main.ConversorDeMoneda existe
            Class.forName("Main.ConversorDeMoneda");

            // Si llegamos aquí, la clase existe, así que intentamos ejecutarla
            System.out.println("Redirigiendo al programa principal...");
            // Usamos reflexión para invocar el método main
            Class<?> mainClass = Class.forName("Main.ConversorDeMoneda");
            java.lang.reflect.Method mainMethod = mainClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) args);
            return;
        } catch (ClassNotFoundException e) {
            // La clase no existe, continuamos con la ejecución normal
            System.out.println("No se pudo encontrar la clase principal. Ejecutando en modo básico.");
        } catch (Exception e) {
            // Otro error, continuamos con la ejecución normal
            System.out.println("Error al intentar ejecutar el programa principal: " + e.getMessage());
        }

        // Crear un nuevo Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el encabezado
        System.out.println("========================================");
        System.out.println("        Conversor de Moneda");
        System.out.println("      Desarrollado por: Carlos I. Otero E.");
        System.out.println("             Panamá");
        System.out.println("========================================");

        // Verificar si existen los archivos necesarios
        File srcDir = new File("src");
        File libDir = new File("lib");
        File jsonJar = new File("lib/json-20231013.jar");

        if (!srcDir.exists() || !libDir.exists() || !jsonJar.exists()) {
            System.out.println("ADVERTENCIA: No se encontraron todos los archivos necesarios.");
            System.out.println("Asegúrese de que la estructura del proyecto sea correcta:");
            System.out.println("- src/Main/*.java: Archivos fuente");
            System.out.println("- lib/json-20231013.jar: Biblioteca JSON");
        }

        System.out.println("\nPara usar el conversor de moneda, ejecute uno de estos comandos:");
        System.out.println("1. java -classpath \".;lib/json-20231013.jar;src\" Main.ConversorDeMoneda");
        System.out.println("2. ejecutar_principal.bat");

        System.out.println("\nPresione Enter para salir...");
        scanner.nextLine();
        scanner.close();
    }
}
