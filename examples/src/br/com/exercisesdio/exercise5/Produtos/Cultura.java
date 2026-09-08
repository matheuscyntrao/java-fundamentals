package br.com.exercisesdio.exercise5.Produtos;

public class Cultura extends Produto {

    public Cultura(double valor) {
        super(valor);
    }

    @Override
    public double valorImposto() {
        return this.getValor() * 0.04;
    }

}
