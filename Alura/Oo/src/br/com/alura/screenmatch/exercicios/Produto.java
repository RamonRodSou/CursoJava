package br.com.alura.screenmatch.exercicios;

public class Produto {

    private String nome;
    private double preco;

    public String getNome (){
        return nome;
    }

    public double getPreco (){
        return preco;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setPreco (double preco){
        this.preco = preco;
    }

    public double aplicaDesconto(double desconto){
       return  preco * desconto;
    }
}
