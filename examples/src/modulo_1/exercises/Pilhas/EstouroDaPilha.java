package modulo_1.exercises.Pilhas;

public class EstouroDaPilha {

    private static long contadorFrames = 0;

    public static void main(String[] args) {
        System.out.println("MEMÓRIA STACK");

        try {
            metodoRecursivoInflood(100, 200, 300);
        } catch (StackOverflowError e) {
            System.out.println(e);
            System.out.printf("A Stack da sua Thread principal estourou após empilhar %,d frames!%n", contadorFrames);
        }
    }

    private static void metodoRecursivoInflood(int param1, int param2, int param3) {
        contadorFrames++;

        long variavelLocal1 = contadorFrames;
        long variavelLocal2 = variavelLocal1 * 2;

        metodoRecursivoInflood(param1, param2, param3);
    }
}