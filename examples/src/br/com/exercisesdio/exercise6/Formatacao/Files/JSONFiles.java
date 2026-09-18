package br.com.exercisesdio.exercise6.Formatacao.Files;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class JSONFiles extends File {

    public JSONFiles(String fileName) {
        super(fileName);
    }

    @Override
    public Map<String, Object> read() {
        return Map.of();
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFullDir().toFile()))) {
            writer.write(String.valueOf(parseJson(content)));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public String edit(Map<String, Object> content) {
        return "";
    }

    public String parseJson(Map<String, Object> content) {
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
