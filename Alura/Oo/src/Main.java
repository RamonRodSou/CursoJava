import br.com.alura.screenmatch.modelos.Film;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film meuFilme = new Film();
        meuFilme.setNome ("O poderoso chefão");
        meuFilme.setAnoDeLancamento (1970);
        meuFilme.setDuracaoEmMinutos (180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliaçôes" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        // nao s epode deixar alterar direto assim precisa de mais segurança, tem que deixar privado
        //meuFilme.somaDasAvalicoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


    }
}