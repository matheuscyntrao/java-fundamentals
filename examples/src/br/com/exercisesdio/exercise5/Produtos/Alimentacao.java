package br.com.exercisesdio.exercise5.Produtos;

public class Alimentacao implements Produto {

    private final double valor;

    public Alimentacao(double valor) {
        this.valor = valor;
    }

    @Override
    public double valorImposto() {
        return this.getValor()  * 0.01;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

}
