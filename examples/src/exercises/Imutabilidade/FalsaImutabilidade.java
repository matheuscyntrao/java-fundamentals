package exercises.Imutabilidade;

import java.util.List;

public final class FalsaImutabilidade {
    private final List<String> listaMutavel;

    public FalsaImutabilidade(List<String> lista) {
        this.listaMutavel = lista; // ERRO 1: Salvou a referência direta do objeto externo!
    }

    public List<String> getListaMutavel() {
        return this.listaMutavel; // ERRO 2: Entregou a chave do castelo para o mundo externo!
    }
}