package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserJson;

import java.io.*;
import java.util.Map;

public class JSONIOFile extends MyFile {

    public JSONIOFile(String fileName) {
        super(fileName);
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFullDir().toFile()))) {
            writer.write(ParserJson.parse(content));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
