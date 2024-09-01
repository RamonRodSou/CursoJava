package br.com.alura.comsumindoApi.desafio;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class desafio01 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu CEP: ");
        String cep = entrada.nextLine();
        BuscarCep buscarCep = new BuscarCep();

        try{
            Endereco endereco = buscarCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo salvarJson = new GeradorDeArquivo();
            salvarJson.geraJson(endereco);

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação ");
        }

    }
}
