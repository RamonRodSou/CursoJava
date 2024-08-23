import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.exercicios.CalculadoraSalaRetangular;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Film;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import br.com.alura.screenmatch.modelos.Serie;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film meuFilme = new Film();
        meuFilme.setNome ("O poderoso chefão");
        meuFilme.setAnoDeLancamento (1970);
        meuFilme.setDuracaoEmMinutos (180);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliaçôes" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Film f2 = new Film();
        f2.setNome("Coração");
        f2.setDuracaoEmMinutos(120);
        f2.setAnoDeLancamento(2000);

        System.out.println("-----------------------------");

        // nao s epode deixar alterar direto assim precisa de mais segurança, tem que deixar privado
        //meuFilme.somaDasAvalicoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


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
        calculadora.inclui(meuFilme);
        calculadora.inclui(f2);
        calculadora.inclui(s1);

        System.out.println("Somando o tempo dos filmes/série: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNome("As as venturas do Principal");
        episodio.setSerie(s1);
        episodio.setTotalDeAvaliacao(300);

        filtro.filtra(episodio);

        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();

        retangulo.setAltura(10.0);
        retangulo.setBase(5.0);
        retangulo.calcularArea();
        retangulo.getBase();

        retangulo.resultado();

    }

}