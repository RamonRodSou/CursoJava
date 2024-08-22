package br.com.alura.screenmatch.exercicios;

public class Aluno {

    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public double[] getNota() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia () {
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
