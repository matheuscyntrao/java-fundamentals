package br.com.exercisesdio.exercise6.Formatacao.Files;

import br.com.exercisesdio.exercise6.Formatacao.FileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class File implements FileManager {

    private final String userDir = System.getProperty("user.dir");
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
        try {
            Files.createDirectories(this.getFullDir().getParent());
            System.out.println("Arquivo encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Path getFullDir() {
        String filesDir = "files";
        return Path.of(userDir, filesDir, this.getFileName());
    }

    public String getFileName() {
        return fileName;
    }

}
