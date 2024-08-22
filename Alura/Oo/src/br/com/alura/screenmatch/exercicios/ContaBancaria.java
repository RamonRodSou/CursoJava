package br.com.alura.screenmatch.exercicios;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }
}
