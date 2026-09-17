package br.com.exercisesdio.exercise6.Formatacao;

import java.util.Map;

public interface FileManager {

    Map<String, Object> read();

    String write(final Map<String, Object> content);

    boolean delete(final String key);

    String edit(final Map<String, Object> content);

}
