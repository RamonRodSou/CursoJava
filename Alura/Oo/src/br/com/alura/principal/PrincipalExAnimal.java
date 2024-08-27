package br.com.alura.principal;

import br.com.alura.screenmatch.exercicios.Animal;
import br.com.alura.screenmatch.exercicios.Cachorro;

public class PrincipalExAnimal {
    public static void main(String[] args) {

        Animal animal = new Cachorro();
        if (animal instanceof Cachorro cachorro) {
            cachorro.correr();
        }
    }
}
