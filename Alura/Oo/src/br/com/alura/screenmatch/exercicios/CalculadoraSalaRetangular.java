package br.com.alura.screenmatch.exercicios;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void resultado () {
        System.out.println("A área do retangulo é: " + calcularArea());
        System.out.println("O perímetro do retangulo é: " +calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return altura * base;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * ( altura + base);
    }
}
