package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserJson;
import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserXML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class XMLNIOFile extends  MyFile {

    public XMLNIOFile(String fileName) {
        super(fileName);
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try {
            Files.writeString(getFullDir(), ParserXML.parse(content),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
