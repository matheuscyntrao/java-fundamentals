package br.com.exercisesdio.exercise5.Produtos;

public class Cultura implements Produto {

    private final double valor;

    public Cultura(double valor) {
        this.valor = valor;
    }

    @Override
    public double valorImposto() {
        return this.getValor() * 0.04;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

}
