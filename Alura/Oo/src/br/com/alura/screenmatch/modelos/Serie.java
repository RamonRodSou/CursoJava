package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporada;
    private boolean ativa;
    private int episodioPorTemporada;
    private double minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento, double duracaoEmMinutos, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes);
    }


    public int getTemporada (int i) {
        return temporada;
    }

    public void setTemporada (int temporada){
        this.temporada = temporada;
    }

    public boolean getAtiva (){
        return ativa;
    }

    public void setAtiva (boolean ativa){
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada(){
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada){
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public double getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override // Sobre-escrever o método
    public double getDuracaoEmMinutos() {
        return temporada * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() +  ", (" + this.getAnoDeLancamento() + ")";
    }
}
