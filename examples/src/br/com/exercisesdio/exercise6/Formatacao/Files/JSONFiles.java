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
            stringBuilder.append("\"" + entry.getKey() + "\"");
            stringBuilder.append(":");
            if(entry.getValue() instanceof String || entry.getValue() instanceof LocalDate || entry.getValue() instanceof LocalDateTime) {
                stringBuilder.append("\""+ entry.getValue() +"\"");
            } else {
                stringBuilder.append("" + entry.getValue());
            }
            if(!(index == totalSize - 1)) {
                stringBuilder.append(",");
            }
            index++;
        }
        stringBuilder.append("}");
        return String.valueOf(stringBuilder);
    }

}
