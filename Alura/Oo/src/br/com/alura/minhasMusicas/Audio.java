package br.com.alura.minhasMusicas;

public class Audio implements Estatisticas {

    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz (){
        this.totalDeReproducao++;
    }


    @Override
    public void totalDeCurtida() {
        System.out.println(titulo + " tem " + curtidas + " curtidas");
    }

    @Override
    public void totalDeReproducao() {
        System.out.println(titulo + " tem " + totalDeReproducao + " reproduções");
    }

}
