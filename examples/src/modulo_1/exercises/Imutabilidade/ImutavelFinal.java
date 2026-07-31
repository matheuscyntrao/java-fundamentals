package modulo_1.exercises.Imutabilidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImutavelFinal {

    private final int numeralImutavel;
    private final String nomeImutavel;
    private final List<String> listaColecaoImutavel;

    public ImutavelFinal(int numeralImutavel, String nomeImutavel, List<String> listaOriginal) {
        this.numeralImutavel = numeralImutavel;
        this.nomeImutavel = nomeImutavel;
        if (listaOriginal == null) {
            this.listaColecaoImutavel = new ArrayList<>();
        } else {
            this.listaColecaoImutavel = new ArrayList<>(listaOriginal);
        }
    }

    public int getNumeralImutavel() {
        return numeralImutavel;
    }

    public String getNomeImutavel() {
        return nomeImutavel;
    }

    public List<String> getListaColecaoImutavel() {
        return Collections.unmodifiableList(this.listaColecaoImutavel);
    }

    public static void main(String[] args) {
        List<String> listaDeAtaque = new ArrayList<>();
        listaDeAtaque.add("Item Original A");
        listaDeAtaque.add("Item Original B");
        ImutavelFinal objeto = new ImutavelFinal(42, "Objeto Raiz", listaDeAtaque);
        listaDeAtaque.add("Item Invasor Construtor");
        try {
            objeto.getListaColecaoImutavel().add("Item Invasor Getter");
        } catch (UnsupportedOperationException e) {
            System.out.println("O sistema barrou a tentativa de alteração via getter");
        }

        System.out.println(objeto.getListaColecaoImutavel());
        System.out.println(objeto.getListaColecaoImutavel().size() == 2);
    }
}