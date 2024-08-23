package br.com.alura.screenmatch.exercicios;

public class conversorMoeda implements ConversaoFinanceira{

    private double dolar;

    public void getDolar (double dolar){
        this.dolar = dolar;
    }

    public double setDolar () {
        return dolar;
    }

    @Override
    public double converterDolarParaReal(double real){
        return real / dolar;
    }

}
