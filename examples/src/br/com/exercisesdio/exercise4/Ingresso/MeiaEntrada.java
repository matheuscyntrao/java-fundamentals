package br.com.exercisesdio.exercise4.Ingresso;

public final class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeDoFilme, Linguagem linguagem) {
        super(valor, nomeDoFilme, linguagem);
    }

    @Override
    public double getValor() {
        return super.getValor()/2;
    }
}
