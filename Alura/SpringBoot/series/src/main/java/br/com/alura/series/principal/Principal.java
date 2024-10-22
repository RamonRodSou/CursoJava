package br.com.alura.series.principal;

import br.com.alura.series.model.DadosEpisodio;
import br.com.alura.series.model.DadosSerie;
import br.com.alura.series.model.DadosTemporada;
import br.com.alura.series.model.Episodio;
import br.com.alura.series.service.ConsumoAPI;
import br.com.alura.series.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
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

//        System.out.println("Digite um trecho do título do episódio:");
//        var trechoTitulo = entrada.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//
//        if(episodioBuscado.isPresent()){
//            System.out.println("Episodio encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        }else {
//            System.out.println("Episodio não encontrado");
//        }
        System.out.println("Digite um trecho do título do episódio:");
        var trechoTitulo = entrada.nextLine();
        Optional<Episodio> episodioBuscado = episodios.stream()
                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
                .findFirst();

        if(episodioBuscado.isPresent()){
            System.out.println("Episodio encontrado!");
            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
        }else {
            System.out.println("Episodio não encontrado");
        }

//        System.out.println("A partir de que ano você deseja ver os episódios? ");
//        var ano = entrada.nextInt();
//        entrada.nextLine();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        episodios.stream()
//                .filter( e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getTemporada() +
//                                " Eposódio: " + e.getTemporada() +
//                                " Data Lançamento: " + e.getDataLancamento().format(formatador)
//                ));
//
//
//
////      Verificando se ha book,. usando o PEEK para comentar cada etapada da stream
//        System.out.println("\n Top 5 episódios");
//        dadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println("1- Verificar se nao tem nenhum com a avaliacao N/A " + e))
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//                .peek(e -> System.out.println("2- Ordenando " + e))
//                .limit(5)
//                .peek(e -> System.out.println("3- Limite de 5 " + e))
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("4- Mapeamento para letras maiusculas " + e))
//
//                .forEach(System.out::println);


        Map<Integer, Double> avaliacoesPorTemporadas = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));

        System.out.println(avaliacoesPorTemporadas);

        // Gerar Estatisticas
        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

        System.out.println("Media: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());

    }

}
