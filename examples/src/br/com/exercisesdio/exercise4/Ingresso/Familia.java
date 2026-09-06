package br.com.exercisesdio.exercise4.Ingresso;

public final class Familia extends Ingresso {

    private final int quantidadePessoas;

    public Familia(double valor, int quantidadePessoas, String nomeDoFilme, Linguagem linguagem) {
        super(valor, nomeDoFilme, linguagem);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor() * quantidadePessoas;
        if(this.quantidadePessoas > 3) {
            return valorTotal * 0.95;
        }
        return valorTotal;
    }
}
