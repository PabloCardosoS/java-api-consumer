import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco consultaEndereco(String cep) {
        URI enderecoUri = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderecoUri)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("CEP não encontrado.");
        }
    }
}
