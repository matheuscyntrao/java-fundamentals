package br.com.exercisesdio.desafio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Regiao {

    protected final List<Celula> celulas;

    public Regiao(List<Celula> celulas) {
        this.celulas = celulas;
    }

    public boolean isValida() {
        Set<Integer> valoresVistos = new HashSet<>();
        for (Celula celula : celulas) {
            Integer valor = celula.getValue();
            if (valor != null) {
                if (!valoresVistos.add(valor)) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<Celula> getCelulas() {
        return celulas;
    }

    @Override
    public String toString() {
        return this.getCelulas().toString();
    }
}