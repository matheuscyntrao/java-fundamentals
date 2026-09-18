package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserXML;
import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserYaml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class YAMLNIOFile extends MyFile {

    public YAMLNIOFile(String fileName) {
        super(fileName);
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try {
            Files.writeString(getFullDir(), ParserYaml.parse(content),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
