package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.FileManager;

import java.nio.file.Path;

public abstract class File implements FileManager {

    private final String userDir = System.getProperty("user.dir");
    private final String filesDir = "files";
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public Path getFullDir() {
        return Path.of(userDir, filesDir, this.getFileName());
    }

    public String getFileName() {
        return fileName;
    }

}
