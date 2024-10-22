package br.com.rodsoutech.tabelaFipe.principal;

import br.com.rodsoutech.tabelaFipe.service.ComsumoAPI;

import java.util.Scanner;

public class Principal {

    private Scanner entrada = new Scanner(System.in);
    private ComsumoAPI consumo = new ComsumoAPI();

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
            System.out.println(json);
        }
}
