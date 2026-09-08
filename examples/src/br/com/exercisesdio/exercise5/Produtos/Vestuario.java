package br.com.exercisesdio.exercise5.Produtos;

public class Vestuario extends Produto {

    public Vestuario(double valor) {
        super(valor);
    }

    @Override
    public double valorImposto() {
        return this.getValor() * 0.025;
    }

}
