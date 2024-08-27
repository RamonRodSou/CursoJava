package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {
        Film f1 = new Film("O poderoso chefão", 1970, 1988, true, 98.2, 10);
        var f2 = new Film("Coração",120, 2000, true, 58.21, 10);
        var f3 = new Film("A Liga da Faxina", 114, 2020, true, 88.8, 10);

        Serie s1 = new Serie("Cobra Kai", 2000, 4, false, 28.40,2020);

        List<Titulo> listaAssistido = new LinkedList<>();
        listaAssistido.add(f1);
        listaAssistido.add(f2);
        listaAssistido.add(f3);
        listaAssistido.add(s1);


        for(Titulo item: listaAssistido ){
            // System.out.println(item);
            // Assim var dar um erro pq Série nao é filme
            // Film filme = (Film) item;
            // System.out.println("Classificação: " +  filme.getClassificacao());

            System.out.println(item.getNome());
            // Verificando se estour recebendo realmente um filme
            if( item instanceof Film filme && filme.getClassificacao() > 2 ) System.out.println("Classificação: " +  filme.getClassificacao());

        }

        System.out.println("-------Método Foreach atualizdo----------");
        listaAssistido.forEach(item -> System.out.println(item.getNome()));

        System.out.println("--------------Method Reference------------");
        listaAssistido.forEach(System.out::println);


        var f21 = new Film("Coração",120, 2000, true, 58.21, 10);
        var f22= new Film("Coração",120, 2000, true, 58.21, 10);

        if (f22 == f21) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        System.out.println("--------------Ordenação--------------");

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ramon");
        nomes.add("Samara");
        nomes.add("Antonio");
        nomes.add("Eloisa");
        nomes.add("Allan");
        nomes.add("Bianca");

        System.out.println("Sem Ordenação");
        System.out.println(nomes);
        System.out.println("---------------------------------------");

        Collections.sort(nomes);
        System.out.println("Ordenando");
        System.out.println(nomes);
        System.out.println("\b");

        System.out.println("-----Ordenando os Filmes por Nomes-----");
        Collections.sort(listaAssistido);
        System.out.println(listaAssistido);
        System.out.println("\b");

        System.out.println("-----Ordenando os Filmes por Anos-----");
        listaAssistido.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaAssistido);
    }
}
