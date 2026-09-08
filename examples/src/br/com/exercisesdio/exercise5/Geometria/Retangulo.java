package br.com.exercisesdio.exercise5.Geometria;

public class Retangulo extends FormaGeometrica {

    private final double altura;
    private final double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getLado() {
        return this.altura;
    }

    public double getBase() {
        return this.base;
    }

    @Override
    public double calcularArea() {
        return this.getBase() * this.getLado();
    }
}
