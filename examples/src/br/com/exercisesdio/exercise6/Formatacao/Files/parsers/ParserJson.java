package br.com.exercisesdio.exercise6.Formatacao.Files.parsers;

import br.com.exercisesdio.exercise6.Formatacao.Files.StripTags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class ParserJson {

    public static String parse(Map<String, Object> content) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        int index = 0;
        int totalSize = content.size();
        for (Map.Entry<String, Object> entry : content.entrySet()) {
            stringBuilder.append("\"").append(StripTags.limparChave(entry.getKey())).append("\":");
            Object valor = entry.getValue();
            if (valor instanceof String || valor instanceof LocalDate || valor instanceof LocalDateTime) {
                String valorEscapado = StripTags.limparValor(valor).replace("\"", "\\\"");
                stringBuilder.append("\"").append(valorEscapado).append("\"");
            } else {
                stringBuilder.append(valor);
            }
            if (index < totalSize - 1) {
                stringBuilder.append(",");
            }
            index++;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
