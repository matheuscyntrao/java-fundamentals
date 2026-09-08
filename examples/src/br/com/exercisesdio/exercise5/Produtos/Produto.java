package br.com.exercisesdio.exercise5.Produtos;

public abstract class Produto implements IProduto {

    private final double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public abstract double valorImposto();

}
