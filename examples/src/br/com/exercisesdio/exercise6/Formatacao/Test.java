package br.com.exercisesdio.exercise6.Formatacao;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static String formatarNumero(long numero) {
        String numeroStr = String.valueOf(numero);
        long tamanho = numeroStr.length();
        String padraoMascara;
        switch((int) tamanho) {
            case 8:  padraoMascara = "####-####"; break;
            case 9:  padraoMascara = "# ####-####"; break;
            case 11: padraoMascara = "(##) # ####-####"; break;
            default: return numeroStr;
        }
        try {
            MaskFormatter maskFormatter = new MaskFormatter(padraoMascara);
            maskFormatter.setValueContainsLiteralCharacters(false);
            return maskFormatter.valueToString(numeroStr);
        } catch (ParseException e) {
            return numeroStr;
        }
    }

    static void main() {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        long numero = 0;
        Integer[] quantidadeNumerosPermitidos = new Integer[] { 8, 9, 11 };
        do {
            do {
                System.out.println("Digite seu telefone");
                while (!scanner.hasNextLong()) {
                    System.out.println("O valor deve ser um número de 8, 9 ou 11 dígitos.");
                    scanner.next();
                }
                numero = scanner.nextLong();
            } while(!Arrays.asList(quantidadeNumerosPermitidos).contains(String.valueOf(numero).length()));
            System.out.println("Telefone Formatado: " + formatarNumero(numero));
            continuar = false;
        } while(continuar);
        scanner.close(); // Sempre liberar o acesso em memória para a instância de scanner.
    }

}
