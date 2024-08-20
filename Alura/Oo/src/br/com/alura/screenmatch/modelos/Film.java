package br.com.alura.screenmatch.modelos;

public class Film {

    public String nome;
    public int anoDeLancamento;
    public double duracaoEmMinutos;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica () {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
