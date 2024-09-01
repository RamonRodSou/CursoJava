package br.com.alura.comsumindoApi.principal;
import br.com.alura.comsumindoApi.exececao.ErroDeConversaoDeAnoException;
import br.com.alura.comsumindoApi.modelos.Titulo;
import br.com.alura.comsumindoApi.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        String buscar = "";

        List<Titulo> titulos = new ArrayList<>();

        while (!buscar.equalsIgnoreCase("sair")){

            System.out.println("Digite o filme para busca: ");
            buscar = leitura.nextLine();

            if(buscar.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + buscar.replace(" ", "+") + "&apikey=5b788640" ;
            System.out.println(endereco);

            try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                  .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

                }catch (NumberFormatException e ){
                    System.out.println("Aconteceu um erro: ");
                    System.out.println(e.getMessage());

                }catch (IllegalArgumentException e){
                    System.out.println("Aconteceu um erro de argumento, verifique o endereço: ");
                    System.out.println(e.getMessage());
                }catch (ErroDeConversaoDeAnoException e){
                    System.out.println(e.getMessage());
                }
        }

        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou corretamente!");
    }
}
