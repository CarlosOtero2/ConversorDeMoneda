/**
 * Clase principal para ejecutar el Conversor de Moneda desde Eclipse.
 * Esta clase simplemente redirige a la clase principal en el paquete Main.
 */
public class ConversorDeMonedaApp {
    public static void main(String[] args) {
        System.out.println("Iniciando Conversor de Moneda desde Eclipse...");

        try {
            // Ejecutar la clase principal usando reflexión
            Class<?> mainClass = Class.forName("Main.ConversorDeMoneda");
            java.lang.reflect.Method mainMethod = mainClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) args);
        } catch (Exception e) {
            System.out.println("Error al ejecutar el programa principal: " + e.getMessage());
            e.printStackTrace();

            // Mostrar instrucciones alternativas
            System.out.println("\n========================================");
            System.out.println("        Conversor de Moneda");
            System.out.println("      Desarrollado por: Carlos I. Otero E.");
            System.out.println("             Panamá");
            System.out.println("========================================");

            System.out.println("\nPara ejecutar el programa correctamente, siga estos pasos:");
            System.out.println("1. Cierre Eclipse");
            System.out.println("2. Abra una terminal en el directorio del proyecto");
            System.out.println("3. Ejecute: java -classpath \".;lib/json-20231013.jar;src\" Main.ConversorDeMoneda");
            System.out.println("   O simplemente haga doble clic en ejecutar_principal.bat");

            System.out.println("\nSi desea ejecutar desde Eclipse:");
            System.out.println("1. Haga clic derecho en el proyecto");
            System.out.println("2. Seleccione Properties -> Java Build Path -> Libraries");
            System.out.println("3. Haga clic en Add External JARs y seleccione lib/json-20231013.jar");
            System.out.println("4. Aplique los cambios y cierre");
            System.out.println("5. Ejecute esta clase nuevamente");
        }
    }
}
