package br.com.exercisesdio.exercise6.Formatacao.Files.parsers;

import br.com.exercisesdio.exercise6.Formatacao.Files.StripTags;

import java.util.Map;

public class ParserXML {

    public static String parse(Map<String, Object> content) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        stringBuilder.append("<dados>\n");
        for (Map.Entry<String, Object> entry : content.entrySet()) {
            String chaveLimpa = StripTags.limparChave(entry.getKey());
            stringBuilder.append("  <").append(chaveLimpa).append(">")
                    .append(StripTags.limparValor(entry.getValue()))
                    .append("</").append(chaveLimpa).append(">\n");
        }
        stringBuilder.append("</dados>");
        return stringBuilder.toString();
    }

}
