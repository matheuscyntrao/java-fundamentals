package br.com.exercisesdio.exercise6;

import br.com.exercisesdio.exercise6.Formatacao.Files.JSONIOFile;
import br.com.exercisesdio.exercise6.Formatacao.Files.XMLIOFile;
import br.com.exercisesdio.exercise6.Formatacao.Files.YAMLIOFile;
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
                validador.apply(valorBruto).ifPresentOrElse(
                        valorConvertido -> {
                            dadosColetados.put(nomeCampo, valorConvertido);
                            System.out.println("Campo gravado com sucesso!");
                        },
                        () -> System.out.println("O valor difere do tipo informado.")
                );
            } catch (IllegalArgumentException e) {
                System.out.println("O tipo informado não existe");
            }
        } while (true);
        scanner.close();

        if(!dadosColetados.isEmpty()) {
            JSONIOFile jsonioFile = new JSONIOFile("dados.json");
            jsonioFile.write(dadosColetados);
            XMLIOFile xmlioFile = new XMLIOFile("dados.xml");
            xmlioFile.write(dadosColetados);
            YAMLIOFile yamlFiles = new YAMLIOFile("dados.yml");
            yamlFiles.write(dadosColetados);
        } else {
            System.out.println("Nenhum dado foi coletado para realizar o parse.");
        }

    }
}
