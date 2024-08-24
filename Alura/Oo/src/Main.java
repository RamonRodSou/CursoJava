import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.exercicios.CalculadoraSalaRetangular;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Film;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film f1 = new Film();
        f1.setNome ("O poderoso chefão");
        f1.setAnoDeLancamento (1970);
        f1.setDuracaoEmMinutos (180);

        System.out.println("Duração do filme: " + f1.getDuracaoEmMinutos());

        f1.exibeFichaTecnica();
        f1.avalia(8);
        f1.avalia(5);
        f1.avalia(10);

        System.out.println("Total de avaliaçôes" + f1.getTotalDeAvaliacoes());
        System.out.println(f1.pegaMedia());

        System.out.println("-----------------------------");

        Film f2 = new Film();
        f2.setNome("Coração");
        f2.setDuracaoEmMinutos(120);
        f2.setAnoDeLancamento(2000);

        f2.exibeFichaTecnica();
        System.out.println("-----------------------------");


        var f3 = new Film();
        f3.setNome("A Liga da Faxina");
        f3.setDuracaoEmMinutos(114);
        f3.setAnoDeLancamento(2020);

        f3.exibeFichaTecnica();

        System.out.println("-----------------------------");





// ----------------------------------------------------------------------------------------------------

        // nao se pode deixar alterar direto assim precisa de mais segurança, tem que deixar privado
        //f1.somaDasAvalicoes = 10;
        //f1.totalDeAvaliacoes = 1;
        //System.out.println(f1.pegaMedia());

// ----------------------------------------------------------------------------------------------------


        Serie s1 = new Serie();
        s1.setNome("Cobra Kai");
        s1.setAtiva(true);
        s1.setTemporada(4);
        s1.setEpisodioPorTemporada(10);
        s1.setMinutosPorEpisodio(28.40);
        s1.setAnoDeLancamento(2020);
        System.out.println("Duração para maratonar Cobra Kai : " + s1.getDuracaoEmMinutos() + " minutos");
        s1.exibeFichaTecnica();

        System.out.println("-----------------------------");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(f1);
        calculadora.inclui(f2);
        calculadora.inclui(s1);

        System.out.println("Somando o tempo dos filmes/série: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(f1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("As as venturas do Principal");
        episodio.setSerie(s1);
        episodio.setTotalDeAvaliacao(300);

        filtro.filtra(episodio);

        System.out.println("-----------------------------");


        ArrayList <Film> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(f1);
        listaDeFilme.add(f2);
        listaDeFilme.add(f3);

        int tamanho = listaDeFilme.size();
        System.out.println("Tamanho da lista: " + tamanho);
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());

        // Re-escrever o toString na classe Film
        System.out.println(listaDeFilme.toString());

        // nao precisaria usar um for, e sim o toString re-escrito.

        for( int i = 0; i < tamanho ; i++){
            System.out.println( i + " Nome do Filme " + listaDeFilme.get(i).getNome() );
        }

        System.out.println("-----------------------------");

        for( Film u: listaDeFilme) {
            System.out.println( "Nome do Filme " + u.getNome() );
        }

    }

}