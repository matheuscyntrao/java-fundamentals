package modulo_1.exercises.Imutabilidade;

import java.util.List;

public final class FalsaImutabilidade {
    private final List<String> listaMutavel;

    public FalsaImutabilidade(List<String> lista) {
        this.listaMutavel = lista;
    }

    public List<String> getListaMutavel() {
        return this.listaMutavel;
    }
}