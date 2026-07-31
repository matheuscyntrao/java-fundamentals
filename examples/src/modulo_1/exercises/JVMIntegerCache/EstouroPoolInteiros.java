package modulo_1.exercises.JVMIntegerCache;

import java.util.ArrayList;
import java.util.List;

public class EstouroPoolInteiros {

    public static void main(String[] args) {
        List<Integer> listaDeMemoria = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();

        int limiteMaximo = 2048;
        long iteracao = 0;

        try {
            while (true) {
                for (int i = 128; i <= limiteMaximo; i++) {
                    listaDeMemoria.add(Integer.valueOf(i));
                    listaDeMemoria.add(Integer.valueOf(-i));
                }

                iteracao++;

                if (iteracao % 50000 == 0) {
                    long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
                    System.out.printf("Lotes de 1 a %d adicionados: %d vezes | Memória Heap Ocupada: %d MB%n",
                            limiteMaximo, iteracao, memoriaUsada);
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Provado: Manter milhões de referências de Wrappers Integer destrói a Heap.");
            System.out.printf("Total de objetos Integer criados e retidos na lista: %,d%n", listaDeMemoria.size());
        }
    }
}