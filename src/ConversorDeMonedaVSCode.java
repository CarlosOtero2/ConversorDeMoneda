/**
 * Clase principal para ejecutar el Conversor de Moneda desde Visual Studio Code.
 * Esta clase simplemente redirige a la clase principal en el paquete Main.
 */
public class ConversorDeMonedaVSCode {
    public static void main(String[] args) {
        System.out.println("Iniciando Conversor de Moneda desde Visual Studio Code...");

        try {
            // Ejecutar la clase principal usando reflexión
            Class<?> mainClass = Class.forName("Main.ConversorDeMoneda");
            java.lang.reflect.Method mainMethod = mainClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) args);
        } catch (NoClassDefFoundError e) {
            System.out.println("Error: No se pudo encontrar una definición de clase necesaria.");
            System.out.println("Mensaje de error: " + e.getMessage());

            if (e.getMessage().contains("org/json/JSONObject")) {
                System.out.println("\nEl error parece estar relacionado con la biblioteca JSON.");
                System.out.println("Asegúrese de que el archivo lib/json-20231013.jar existe y está en el classpath.");
            }

            mostrarInstrucciones();
        } catch (Exception e) {
            System.out.println("Error al ejecutar el programa principal: " + e.getMessage());
            e.printStackTrace();
            mostrarInstrucciones();
        }
    }

    private static void mostrarInstrucciones() {
        System.out.println("\n========================================");
        System.out.println("        Conversor de Moneda");
        System.out.println("      Desarrollado por: Carlos I. Otero E.");
        System.out.println("             Panamá");
        System.out.println("========================================");

        System.out.println("\nPara ejecutar el programa correctamente, siga estos pasos:");
        System.out.println("1. Cierre VS Code");
        System.out.println("2. Abra una terminal en el directorio del proyecto");
        System.out.println("3. Ejecute: java -classpath \".;lib/json-20231013.jar;src\" Main.ConversorDeMoneda");
        System.out.println("   O simplemente haga doble clic en ejecutar_vscode.bat");

        System.out.println("\nSi desea ejecutar desde VS Code:");
        System.out.println("1. Presione F1 y escriba 'Java: Clean Java Language Server Workspace'");
        System.out.println("2. Seleccione 'Restart and delete'");
        System.out.println("3. Cuando VS Code se reinicie, intente ejecutar nuevamente");
    }
}
