import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class BusquedaApi {

    Moneda busquedaDeMoneda(String monedaDeOrigen, String monedaDeDestino , double cantidad)  {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/c9e175c41e23d18bb77f9173" + "/pair/" + monedaDeOrigen + "/" + monedaDeDestino + "/" + cantidad))
                .build();
        HttpResponse<String> respuesta ;
        try {
            respuesta = client
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(respuesta.body(),Moneda.class);
        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException("Intenta de nuevo");
        }

    }

}
