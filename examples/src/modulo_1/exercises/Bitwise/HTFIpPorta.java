package modulo_1.exercises.Bitwise;

/*
    Cenário: Em um sistema de alta frequência (HFT), você recebe milhões de pacotes por segundo.
    Para economizar largura de banda e memória, você precisa compactar um ID de Protocolo (de 0 a 15)
    e uma Porta de Rede (de 0 a 65535) dentro de um único número inteiro (int) de 32 bits,
    e depois conseguir ler esses dados de volta.
 */

public class HTFIpPorta {

    private static final int shiftProtocolo = 0; // Base do int (bits 0 a 3)
    private static final int shiftPorta = 4;     // Logo acima do protocolo (bits 4 a 19)

    private static final int mascaraProtocolo = 0b1111;             // 4 bits
    private static final int mascaraPorta = 0b1111_1111_1111_1111;  // 16 bits

    public static void main(String[] args) {

        // Para o java, em um número de Int 32, a posição 31 é o signal bit (+ ou -)

        int protocolo = 1;      // Binário: 0001
        int porta = 65535;      // Binário: 1111 1111 1111 1111

        // FUSÃO REAL EM UM ÚNICO INT (Usando o operador OR '|')
        int pacoteCompactado = ((protocolo & mascaraProtocolo) << shiftProtocolo) |
                ((porta & mascaraPorta) << shiftPorta);

        // Exibindo o inteiro real unificado no console
        System.out.println("=== PACOTE UNIFICADO NA MEMÓRIA ===");
        System.out.printf("Resultado (Binário 32 bits): %32s%n",
                String.format("%32s", Integer.toBinaryString(pacoteCompactado)).replace(' ', '0'));
    }


}
