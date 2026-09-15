package br.com.exercisesdio.exercise6;

import br.com.exercisesdio.exercise6.Formatacao.ValidadorTipos;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {

    static void main() {
        Map<String, Object> dadosColetados = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String rawText;

        System.out.println("\nInsira os dados no formato seguinte: \nNOME_CAMPO;VALOR;TIPO;\n");
        System.out.println("Tipos possíveis: \nSTRING (João Silva) \nDATE (dd/mm/yyyy)\nDATE_TIME (dd/mm/yyyy hh:mm)\nFLOAT (1.0)\nINTEGER (1) \nBOOLEAN (true/false)");
        System.out.println("\nDigite 0 para sair.\n");
        do {
            System.out.println("Informe os dados CSV:");
            rawText = scanner.nextLine().trim();
            if (rawText.equalsIgnoreCase("0")) {
                break;
            }
            long numeroDeSeparadores = rawText.chars().filter(character -> character == ';').count();
            String[] partes = rawText.split(";");
            if (numeroDeSeparadores < 3 || partes.length < 3) {
                System.out.println("Formato inválido");
                continue;
            }
            String nomeCampo = partes[0].trim().replaceAll("\\s+", "_");
            String valorBruto = partes[1].trim();
            String tipoInformado = partes[2].trim().toUpperCase();
            try {
                ValidadorTipos validador = ValidadorTipos.valueOf(tipoInformado);
                Object valorConvertido = validador.apply(valorBruto);
                if (valorConvertido != null) {
                    dadosColetados.put(nomeCampo, valorConvertido);
                    System.out.println("Campo gravado");
                } else {
                    System.out.println("O valor difere do tipo informado");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("O tipo informado não existe");
            }
        } while (true);

        System.out.println("\nGerando arquivos no diretório.");
        dadosColetados.forEach((campo, valor) -> {
            /*
                CONTINUAR AQUI
                input/output de arquivos para já gerar os arquivos corretamente

                astração e interfaces
                json
                xml
                yml
             */
            System.out.println(campo + " -> " + valor + " (" + valor.getClass().getSimpleName() + ")");
        });
        scanner.close();
    }
}
