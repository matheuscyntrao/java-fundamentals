package br.com.exercisesdio.desafio;

public class Celula {

    private final int posicaoX;
    private final int posicaoY;
    private Integer value;

    public Celula(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public void setValue(Integer value) {
        if (value == null || (value >= 1 && value <= 9)) {
            this.value = value;
        } else {
            System.out.println("Valor inválido! Deve ser entre 1 e 9.");
        }
    }

    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "|" + this.posicaoX + "-" + this.posicaoY + "|";
    }

}
