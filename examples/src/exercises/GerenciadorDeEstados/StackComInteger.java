package exercises.GerenciadorDeEstados;

import java.util.ArrayList;
import java.util.List;

public class StackComInteger {

    private static long contadorFrames = 0;
    private static final List<Integer> referenciasNaHeap = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Recusão na Stack Integer");

        try {
            // Chamamos o método passando Wrappers (Objetos)
            metodoComObjetosNaStack(Integer.valueOf(1), Integer.valueOf(2));
        } catch (StackOverflowError e) {
            System.out.printf("A Stack estourou após %,d frames.%n", contadorFrames);
            System.out.println("Nesse cenário, a Stack guardou PONTEIROS e a Heap guardou os OBJETOS.");
        }
    }

    private static void metodoComObjetosNaStack(Integer p1, Integer p2) {
        contadorFrames++;

        // Variáveis locais que são referências (ponteiros) para objetos na Heap
        // Na Stack, cada variável 'localX' ocupa apenas o tamanho de uma referência (4 ou 8 bytes)
        Integer local1 = Integer.valueOf((int) (contadorFrames + 1));
        Integer local2 = Integer.valueOf((int) (contadorFrames + 2));

        // Para provar que eles geram carga na Heap, poderíamos guardá-los,
        // mas aqui queremos ver o estouro de frame por acúmulo de ponteiros na Stack.

        // Chamada recursiva passando as referências adiante
        metodoComObjetosNaStack(local1, local2);
    }
}