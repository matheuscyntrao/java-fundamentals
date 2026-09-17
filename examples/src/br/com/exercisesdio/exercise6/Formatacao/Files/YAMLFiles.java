package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.FileManager;

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
    public String write(Map<String, Object> content) {
        return "";
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public String edit(Map<String, Object> content) {
        return "";
    }

}
