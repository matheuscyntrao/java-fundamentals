package br.com.exercisesdio.exercise5.Geometria;

public class Circulo extends FormaGeometrica {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * Math.pow(this.getRaio(), 2);
    }
}
