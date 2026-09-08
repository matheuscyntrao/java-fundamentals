package br.com.exercisesdio.exercise5.Produtos;

public class SaudeBemEstar extends Produto {

    public SaudeBemEstar(double valor) {
        super(valor);
    }
    @Override
    public double valorImposto() {
        return this.getValor() * 0.015;
    }

}
