package br.com.alura.series;

import br.com.alura.series.model.DadosSerie;
import br.com.alura.series.service.ConsumoAPI;
import br.com.alura.series.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoAPI = new ConsumoAPI();

		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=5b788640");
		System.out.println(json);

		//json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);

		ConverteDados converor = new ConverteDados();
		DadosSerie dados = converor.obterDados(json, DadosSerie.class);

		System.out.println(dados);
	}
}
