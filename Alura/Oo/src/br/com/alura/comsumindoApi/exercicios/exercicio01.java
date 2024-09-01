package br.com.alura.comsumindoApi.exercicios;



import br.com.alura.comsumindoApi.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class exercicio01 {

    public static void main(String[] args) throws IOException {

        // Exercicio 01
        String texto =  "Conteúdo a ser gravado no arquivo.";
        FileWriter escrita = new FileWriter("arquivo.txt");

        escrita.write(texto);
        escrita.close();


        // Exercicio 02
        FileWriter jsonArquivo = new FileWriter("exercicio.json");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        Titulo serie = new Titulo("Senhor dos aneis", 2024);

        jsonArquivo.write(gson.toJson(serie));
        jsonArquivo.close();


    }
}
