package com.ramonrodsouza.music.principal;

import com.ramonrodsouza.music.model.Artista;
import com.ramonrodsouza.music.model.Genero;
import com.ramonrodsouza.music.model.Musica;
import com.ramonrodsouza.music.model.Tipo;
import com.ramonrodsouza.music.repository.ArtistaRepository;
import com.ramonrodsouza.music.service.ConsultaChatGPT;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ArtistaRepository repository;
    private ConsultaChatGPT consultaChatGPT;

    public Principal (ArtistaRepository repository){
        this.repository = repository;
    };


    public void exibeMenu() {

        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Cadastrar Artista
                    2 - Cadastrar Musica
                    3 - Listar música
                    4 - Buscar Musica por Artista
                    5 - Pesquisar dados sobre um Artista
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusica();
                    break;
                case 3:
                    ListarMusica();
                    break;
                case 4:
                    BuscarMusicaPorArtista();
                    break;
                case 5:
                    BuscarDadosArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    };

    private void cadastrarArtista() {

        var cadastrarNovamente = "S";
        while (cadastrarNovamente.equalsIgnoreCase("s")){
            System.out.println("Informe o nome do artista: ");
            String artistaNome = leitura.nextLine();

            System.out.println("Informe o tipo do artista ( Solo, Dupla ou Banda) :" );
            String tipoArtista = leitura.nextLine();
            Tipo tipo = Tipo.valueOf(tipoArtista.toUpperCase());

            System.out.println("Informe o genero: ");
            String generoArtista = leitura.nextLine();
            Genero genero = Genero.valueOf(generoArtista.toUpperCase());

            Artista artista = new Artista(artistaNome, tipo, genero);
            repository.save(artista);

            System.out.println("Cadastrar novo artista?  (S/N)");
            cadastrarNovamente = leitura.nextLine();
        }

    };

    private void  cadastrarMusica(){

        System.out.println("Inform o nome do artista: ");
        String artistaNome = leitura.nextLine();
        Optional<Artista> artista = repository.findByNomeContainingIgnoreCase(artistaNome);

        if(artista.isPresent()){

            System.out.printf("Informe o nome da musica do(a) artista %s: ", artistaNome);
            String musicaNome = leitura.nextLine();

            var musica = new Musica(musicaNome);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            repository.save(artista.get());

        }else {
            System.out.println("Artista não encontrado");
        }
    };

    private void ListarMusica() {

        List<Artista> artista = repository.findAll();
        artista.forEach(System.out::println);
    };

    private void  BuscarMusicaPorArtista(){

        System.out.println("Inform o nome do artista: ");
        String artistaNome = leitura.nextLine();

        List<Musica> musica = repository.buscaMusicaPorArtista(artistaNome);
        musica.forEach(System.out::println);
    };

    private void  BuscarDadosArtista(){
        System.out.println("Pesquisar dados sobre qual artista? ");
        var nome = leitura.nextLine();
        var resposta = consultaChatGPT.obterInformacao(nome);
        System.out.println(resposta.trim());

    };

}
