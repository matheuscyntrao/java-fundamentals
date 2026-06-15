package exercises.JVMIntegerCache;

public class PoolInteirosCorrigido {

    public static void main(String[] args) {
        System.out.println("=== VERSÃO CORRIGIDA: MEMÓRIA ESTÁVEL E PERFORMANCE MÁXIMA ===\n");

        Runtime runtime = Runtime.getRuntime();
        int limiteMaximo = 2048;
        long iteracao = 0;

        while (iteracao < 100_000_000) {

            for (int i = 128; i <= limiteMaximo; i++) {
                int valorPositivo = i;
                int valorNegativo = -i;
                int resultadoDummy = valorPositivo + valorNegativo;
            }

            iteracao++;

            if (iteracao % 20000000 == 0) {
                long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
                System.out.printf("Ciclos executados: %,d | Memória Heap Ocupada: %d MB (Estável)%n",
                        iteracao, memoriaUsada);
            }
        }

        System.out.println("Sucesso! Bilhões de operações numéricas realizadas sem criar nenhum objeto.");
    }
}