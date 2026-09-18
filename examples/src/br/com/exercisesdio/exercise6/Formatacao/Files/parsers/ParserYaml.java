package br.com.exercisesdio.exercise6.Formatacao.Files.parsers;

import br.com.exercisesdio.exercise6.Formatacao.Files.StripTags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class ParserYaml {

    public static String parse(Map<String, Object> content) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : content.entrySet()) {
            String chaveLimpa = StripTags.limparChave(entry.getKey());
            Object valor = entry.getValue();
            stringBuilder.append(chaveLimpa).append(": ");
            if (valor instanceof String || valor instanceof LocalDate || valor instanceof LocalDateTime) {
                String valorLimpo = StripTags.limparValor(valor).replace("\"", "\\\"");
                stringBuilder.append("\"").append(valorLimpo).append("\"\n");
            } else {
                stringBuilder.append(valor).append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
