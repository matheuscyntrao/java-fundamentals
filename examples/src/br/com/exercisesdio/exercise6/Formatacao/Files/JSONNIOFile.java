package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.Files.parsers.ParserJson;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class JSONNIOFile extends MyFile {

    public JSONNIOFile(String fileName) {
        super(fileName);
    }

    @Override
    public boolean write(Map<String, Object> content) {
        try {
            Files.writeString(getFullDir(), ParserJson.parse(content),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
