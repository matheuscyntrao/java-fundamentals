package br.com.exercisesdio.exercise5.Produtos;

public class Vestuario implements Produto {

    private final double valor;

    public Vestuario(double valor) {
        this.valor = valor;
    }

    @Override
    public double valorImposto() {
        return this.getValor() * 0.025;
    }

    @Override
    public double getValor() {
        return this.valor;
    }


}
