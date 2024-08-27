package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

import java.util.Objects;

public class Film extends Titulo implements Classificavel {

    private String diretor;

    public Film(String nome, int duracaoEmMinutos, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes) {

        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(diretor, film.diretor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(diretor);
    }

    public String getDiretor () {
        return diretor;
    }

    public void setDiretor (String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " +  this.getNome() + ", (" + this.getAnoDeLancamento() + ")";
    }
}
