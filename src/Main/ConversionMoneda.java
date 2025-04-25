package Main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import java.util.Scanner;

public class ConversionMoneda {

    // Constante para la API Key.
    private static final String API_KEY = "dd97b6f3696790f3fe0972b7"; // Clave de API proporcionada

    // URL base de la API (actualizada para v6)
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    // Mapa para almacenar los tipos de cambio
    private static Map<String, Double> exchangeRates = new HashMap<>();

    // Método para realizar la conversión de moneda
    public static void convertirMoneda(String monedaOrigen, String monedaDestino, Scanner scanner) {
        System.out.print("Ingrese la cantidad en " + monedaOrigen + ": ");
        double cantidad = Utilidades.obtenerCantidad(scanner);

        double tipoCambio = obtenerTipoCambio(monedaOrigen, monedaDestino);
        if (tipoCambio != 0) {
            double cantidadConvertida = cantidad * tipoCambio;
            System.out.println(cantidad + " " + monedaOrigen + " es igual a " + cantidadConvertida + " " + monedaDestino);
        } else {
            System.out.println("No se pudo obtener el tipo de cambio.  Por favor, intente de nuevo más tarde.");
        }
    }

    // Método para obtener el tipo de cambio desde la API
    private static double obtenerTipoCambio(String monedaOrigen, String monedaDestino) {
        String conversionCode = monedaOrigen + monedaDestino;

        // Si ya tenemos el tipo de cambio en caché, lo devolvemos
        if (exchangeRates.containsKey(conversionCode)) {
            return exchangeRates.get(conversionCode);
        }

        // Si no tenemos el tipo de cambio en caché, lo obtenemos de la API

        String url = BASE_URL + API_KEY + "/latest/" + monedaOrigen;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                if (response.statusCode() == 403) {
                    System.out.println("Error: Acceso denegado (código 403). Verifique que su clave de API sea válida.");
                    System.out.println("La variable de entorno EXCHANGE_API_KEY debe estar configurada con una clave válida.");
                } else if (response.statusCode() == 404) {
                    System.out.println("Error: Recurso no encontrado (código 404). Verifique la URL de la API.");
                    System.out.println("URL utilizada: " + url);
                    System.out.println("Verifique que la moneda '" + monedaOrigen + "' sea válida.");
                } else {
                    System.out.println("Error: La API devolvió el código de estado " + response.statusCode());
                }
                return 0;
            }
            String responseBody = response.body();

            // Parsear la respuesta JSON
            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONObject rates = jsonResponse.getJSONObject("conversion_rates");
            if (rates.has(monedaDestino)) {
                double rate = rates.getDouble(monedaDestino);
                exchangeRates.put(conversionCode, rate);
                return rate;
            } else {
                System.out.println("No se encontró la moneda destino en la respuesta de la API.");
                return 0;
            }

        } catch (IOException e) {
            System.out.println("Error de E/S al conectar con la API: " + e.getMessage());
            System.out.println("Verifique su conexión a Internet.");
            return 0;
        } catch (InterruptedException e) {
            System.out.println("La operación fue interrumpida: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace(); // Imprimir stack trace para depuración
            return 0;
        }
    }
}