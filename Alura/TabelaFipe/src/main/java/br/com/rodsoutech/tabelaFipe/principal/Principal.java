package br.com.rodsoutech.tabelaFipe.principal;

import br.com.rodsoutech.tabelaFipe.model.Dados;
import br.com.rodsoutech.tabelaFipe.model.Modelos;
import br.com.rodsoutech.tabelaFipe.model.Veiculo;
import br.com.rodsoutech.tabelaFipe.service.ComsumoAPI;
import br.com.rodsoutech.tabelaFipe.service.ConverteDados;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private static final Logger log = LoggerFactory.getLogger(Principal.class);
    private Scanner entrada = new Scanner(System.in);
    private ComsumoAPI consumo = new ComsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

        public void exibeMenu() {
            var menu = """
                        *** OPÇÕES ***
                        Carro
                        Moto
                        Caminhão
                    
                        Digite uma das opções:
                    """;

            System.out.println(menu);
            var opcao = entrada.nextLine();

            String endereco = new String();

            if(opcao.toLowerCase().contains("carr")){
                endereco = URL_BASE + "carros/marcas";
            }
            else if(opcao.toLowerCase().contains("mot")){
                endereco = URL_BASE + "motos/marcas";
            }
            else if(opcao.toLowerCase().contains("cami")){
                endereco = URL_BASE + "caminhoes/marcas/";
            }
            else{
                System.err.println("Opção invalida!");
            }

            var json = consumo.obterDados(endereco);
            var marcas = conversor.obterLista(json, Dados.class);
            marcas.stream()
                    .sorted(Comparator.comparing(Dados::codigo)) // ordenar pelo código
                    .forEach(System.out::println);

            System.out.println("Digite o código da marca para consulta:");
            String codigoMarca = entrada.nextLine();

            endereco = endereco + "/" + codigoMarca + "/modelos";
            json = consumo.obterDados(endereco);
            var modeloLista = conversor.obterDados(json, Modelos.class);

            System.out.println("\nModelos dessa marca: ");
            modeloLista.modelos().stream()
                    .sorted(Comparator.comparing(Dados::codigo))
                    .forEach(System.out::println);

            System.out.println("Informe o nome do veículo:");
            String nomeVeiculo = entrada.nextLine();

            List<Dados> modelosFiltrados = modeloLista.modelos()
                    .stream()
                    .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                    .collect(Collectors.toList());


            System.out.println("\nModelos do veículo");
            modelosFiltrados.forEach(System.out::println);

            System.out.println("Digite o código do veículo para buscar os valores de avaliação:");
            String codigoVeiculo = entrada.nextLine();

            endereco = endereco + "/" + codigoVeiculo + "/anos";
            json = consumo.obterDados(endereco);
            List<Dados> anos = conversor.obterLista(json, Dados.class);
            List<Veiculo> veiculos = new ArrayList<>();

            for (int i = 0; i < anos.size(); i++) {

                var enderecoAno = endereco + "/" + anos.get(i).codigo();
                json = consumo.obterDados(enderecoAno);

                Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
                veiculos.add(veiculo);
            }

            System.out.println("\nTodos os veículos filtrados com avaliação por ano: ");
            veiculos.forEach(System.out::println);
        }
}
