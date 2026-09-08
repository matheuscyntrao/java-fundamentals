package br.com.exercisesdio.exercise5.Geometria;

public class Quadrado extends FormaGeometrica {

    private final double valorLado;

    public Quadrado(double valorLado) {
        this.valorLado = valorLado;
    }

    public double getValorLado() {
        return this.valorLado;
    }

    @Override
    public double calcularArea() {
        return this.getValorLado() * this.getValorLado();
    }
}
