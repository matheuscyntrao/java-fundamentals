package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.FileManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class YAMLFiles extends File {

    public YAMLFiles(String fileName) {
        super(fileName);
    }

    @Override
    public Map<String, Object> read() {
        return Map.of();
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFullDir().toFile()))) {
            writer.write(String.valueOf(parseYAML(content)));
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

    public String parseYAML(Map<String, Object> content) {
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
