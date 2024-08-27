package br.com.alura.screenmatch.exercicios;

public class Cachorro extends  Animal{

    @Override
    void fazerSom() {
        System.out.println("Latido");
    }

    public void correr() {
        System.out.println("Cachorro está correndo");
    }
}
