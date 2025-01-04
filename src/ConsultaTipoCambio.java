import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTipoCambio {
    private static final String apiKey = "17112b7c6cdfce6c11bbcfc0";
    private static final String URL = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

    public TipoCambio consultarTipoCambio() {
        URI direccion = URI.create(URL);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoCambio.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio. Detalles: " + e.getMessage());
        }
    }
}
