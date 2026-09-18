package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserYaml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class YAMLIOFile extends MyFile {

    public YAMLIOFile(String fileName) {
        super(fileName);
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFullDir().toFile()))) {
            writer.write(ParserYaml.parse(content));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
