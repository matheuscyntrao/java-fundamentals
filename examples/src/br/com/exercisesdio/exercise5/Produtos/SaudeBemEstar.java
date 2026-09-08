package br.com.exercisesdio.exercise5.Produtos;

public class SaudeBemEstar implements Produto {

    private final double valor;

    public SaudeBemEstar(double valor) {
        this.valor = valor;
    }

    @Override
    public double valorImposto() {
        return this.getValor() * 0.015;
    }

    @Override
    public double getValor() {
        return this.valor;
    }


}
