package exercises.GerenciadorDeEstados;

public class IntVsByte {

    private static final int TAMANHO_ARRAY = 20_000_000; // 20 Milhões de elementos
    private static final int MASCARA_BITWISE = 1 << 3;    // Flag de teste

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // -------------------------------------------------------------------------
        // TESTE 1: PERFORMANCE E MEMÓRIA COM BYTE
        // -------------------------------------------------------------------------
        gcCompleto();
        long memoriaAntesByte = runtime.totalMemory() - runtime.freeMemory();
        long tempoInicioByte = System.currentTimeMillis();

        byte[] arrayBytes = new byte[TAMANHO_ARRAY];
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            arrayBytes[i] = (byte) (arrayBytes[i] | MASCARA_BITWISE);
        }

        long tempoFimByte = System.currentTimeMillis();
        long memoriaDepoisByte = runtime.totalMemory() - runtime.freeMemory();
        long tempoTotalByte = tempoFimByte - tempoInicioByte;
        long memoriaConsumidaByte = (memoriaDepoisByte - memoriaAntesByte) / (1024 * 1024);

        // -------------------------------------------------------------------------
        // TESTE 2: PERFORMANCE E MEMÓRIA COM INT
        // -------------------------------------------------------------------------
        arrayBytes = null;
        gcCompleto();

        long memoriaAntesInt = runtime.totalMemory() - runtime.freeMemory();
        long tempoInicioInt = System.currentTimeMillis();

        int[] arrayInts = new int[TAMANHO_ARRAY];
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            arrayInts[i] = arrayInts[i] | MASCARA_BITWISE;
        }

        long tempoFimInt = System.currentTimeMillis();
        long memoriaDepoisInt = runtime.totalMemory() - runtime.freeMemory();
        long tempoTotalInt = tempoFimInt - tempoInicioInt;
        long memoriaConsumidaInt = (memoriaDepoisInt - memoriaAntesInt) / (1024 * 1024);


        System.out.println("8 BITS");
        System.out.printf("Tempo de execução: %d ms%n", tempoTotalByte);
        System.out.printf("Memória Heap aproximada ocupada: %d MB%n", memoriaConsumidaByte);

        System.out.println("32 BITS");
        System.out.printf("Tempo de execução: %d ms%n", tempoTotalInt);
        System.out.printf("Memória Heap aproximada ocupada: %d MB%n", memoriaConsumidaInt);

        System.out.println("O array de byte consome exatamente 4x menos memória na Heap.");
        System.out.println("O int roda direto nos registradores nativos, enquanto o byte exige que a CPU faça constantes conversões implícitas.");
    }

    // Garbage collector
    private static void gcCompleto() {
        for (int i = 0; i < 3; i++) {
            System.gc();
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
        }
    }
}