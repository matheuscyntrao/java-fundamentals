package exercises.JVMIntegerCache;

/*

    O Integer Cache é um dos segredos mais negligenciados por quem só estuda Java por tutorial
    raso do YouTube e acha que entende de gerenciamento de memória. É o tipo de comportamento
    subjacente da JVM que separa quem escova bytes de quem só digita código.

    Vamos destrinchar esse comportamento, escrever o código de teste estrito e entender o que acontece
    por baixo dos panos na memória Heap.

 */

public class BugPoolInteiros {

    public static void main(String[] args) {
        System.out.println("=== TESTANDO O INTEGER CACHE DA JVM (1 a 200) ===\n");

        for (int i = 1; i <= 200; i++) {
            // Autoboxing: o compilador transforma isso em Integer.valueOf(i)
            // -XX:AutoBoxCacheMax=2000
            Integer a = i;
            Integer b = i;

            boolean comparacaoReferencia = (a == b);
            boolean comparacaoValor = a.equals(b);

            System.out.printf("Valor: %d | (a == b) [Referência]: %b | (a.equals(b)) [Valor]: %b%n",
                    i, comparacaoReferencia, comparacaoValor);

            if (i == 127) {
                System.out.println("⚠️ Fora do Integer Caching da JVM:");
            }
        }
    }
}
