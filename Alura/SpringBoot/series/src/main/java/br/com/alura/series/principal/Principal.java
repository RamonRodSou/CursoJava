package br.com.alura.series.principal;

import br.com.alura.series.model.DadosSerie;
import br.com.alura.series.model.DadosTemporada;
import br.com.alura.series.service.ConsumoAPI;
import br.com.alura.series.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

			json =  consumo.obterDados (ENDERECO + nomeSerie +  "&season=" + i + API_KEY);
			DadosTemporada dadosTemporada = converor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);

		}
		temporadas.forEach(System.out::println);
		System.out.println("---------------------------------------------");
    }
}
