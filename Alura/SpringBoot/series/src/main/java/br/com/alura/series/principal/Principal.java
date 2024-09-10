package br.com.alura.series.principal;

import br.com.alura.series.model.DadosEpisodio;
import br.com.alura.series.model.DadosSerie;
import br.com.alura.series.model.DadosTemporada;
import br.com.alura.series.model.Episodio;
import br.com.alura.series.service.ConsumoAPI;
import br.com.alura.series.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner entrada = new Scanner(System.in);

    private  ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados converor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5b788640";

    public void exibeMenu() {

        System.out.println("Digite o nome da série para busca: ");
        String nomeSerie = entrada.nextLine().replace(" ", "+");

        var json = consumo.obterDados(ENDERECO + nomeSerie + API_KEY);
        DadosSerie dados = converor.obterDados(json, DadosSerie.class);
        System.out.println(dados);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {

            json = consumo.obterDados(ENDERECO + nomeSerie + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);

        }
        temporadas.forEach(System.out::println);
        System.out.println("---------------------------------------------");

//        for (int i = 0; i < dados.totalTemporadas(); i++) {
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

//      Refatorando usando Lambdas " -> " Funções Anonimas
//      temporada.forRach ((parametro) -> expressao ) parametro sao a representacao de uma temporada
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        // Stream é um fluxo de dados  ( cada temporada, cada episodio ) sao fluxos de dados
        // Executa operacoes intermediarias, consigo fazer varias operacoes dentro do stream

//        List<String> nomes = Arrays.asList("Ramon", "Samara", "Antonio", "Eloisa", "Hilda", "Selma");
//
//        nomes.stream()
//                .sorted()
//                .limit(5)
//                .map(s -> s.replace("Samara", "Mamae"))
//                .map(s -> s.replace("Ramon", "Papai"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);


        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList()); // .toList();   // coleção imutavel, nao consigo add nada novo


        System.out.println("\n Top 5 episódios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map( d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());

        episodios.forEach(System.out::println);
    }


}
