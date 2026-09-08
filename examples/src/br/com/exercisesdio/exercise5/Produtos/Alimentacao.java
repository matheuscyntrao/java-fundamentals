package br.com.exercisesdio.exercise5.Produtos;

public class Alimentacao extends Produto {

    public Alimentacao(double valor) {
        super(valor);
    }

    @Override
    public double valorImposto() {
        return this.getValor()  * 0.01;
    }

}
