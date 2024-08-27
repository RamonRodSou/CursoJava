package br.com.alura.principal;

import br.com.alura.screenmatch.exercicios.Pessoa;

import java.util.ArrayList;

public class PrincipalExercicios {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ramon");
        p1.setIdade(31);

        Pessoa p2 = new Pessoa();
        p2.setNome("Samara");
        p2.setIdade(32);

        Pessoa p3 = new Pessoa();
        p3.setNome("Antonio");
        p3.setIdade(4);

        Pessoa p4 = new Pessoa();
        p4.setNome("Eloisa");
        p4.setIdade(2);

        ArrayList <Pessoa> rodrigues = new ArrayList<>();
        rodrigues.add(p1);
        rodrigues.add(p2);
        rodrigues.add(p3);
        rodrigues.add(p4);

        System.out.println("Nome do Pai: " + rodrigues.get(0));
        System.out.println("Quantos membros tem na fámiia " + rodrigues.size());
        System.out.println("Familia Rodrigues: " + rodrigues.toString());


    }

}
