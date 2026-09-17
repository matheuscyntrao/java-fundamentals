package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.FileManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XMLFiles extends File {

    public XMLFiles(String fileName) {
        super(fileName);
    }

    @Override
    public Map<String, Object> read() {
        return Map.of();
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFullDir().toFile()))) {
            writer.write(String.valueOf(parseXML(content)));
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

    public String parseXML(Map<String, Object> content) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<dados>");
        for (Map.Entry<String, Object> entry : content.entrySet()) {
            stringBuilder.append("<"+ entry.getKey()+">"+entry.getValue() +"</"+ entry.getKey()+">");
        }
        stringBuilder.append("</dados>");
        return String.valueOf(stringBuilder);
    }

}
