package br.com.alura.comsumindoApi.principal;

import br.com.alura.comsumindoApi.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o filme para busca: ");

        var buscar = leitura.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + buscar + "&apikey=5b788640" ;
        System.out.println(endereco);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();


       // client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        //        .thenApply(HttpResponse::body)
        //        .thenAccept(System.out::println)
        //        .join();

        HttpResponse<String> response = client
              .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        Titulo meuTitulo = gson.fromJson(json, Titulo.class);

        System.out.println(meuTitulo);
    }
}