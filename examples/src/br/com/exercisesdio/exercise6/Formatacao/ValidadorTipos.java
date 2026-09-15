package br.com.exercisesdio.exercise6.Formatacao;


import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.function.Function;

public enum ValidadorTipos {

    STRING((t) -> {
        if(t == null || t.trim().isEmpty()) return null;
        return t.trim();
    }),
    DATE((t) -> {
        if (t == null || !t.trim().matches("\\d{2}/\\d{2}/\\d{4}")) throw new DateTimeException("Erro ao converter data");
        return LocalDate.parse(t.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }),
    DATE_TIME((t) -> {
        if (t == null || !t.trim().matches("\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}")) throw new DateTimeException("Erro ao converter data e hora");
        return LocalDateTime.parse(t.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }),
    FLOAT((t) -> {
        try {
           return Double.parseDouble(t);
        } catch (NumberFormatException ex) {
            System.out.println("Problema ao converter ponto flutuante.");
        }
        return null;
    }),
    INTEGER((t) -> {
        try {
            return Integer.parseInt(t);

        } catch (NumberFormatException ex) {
            System.out.println("Problema ao converter tipo inteiro.");
        }
        return null;
    }),
    BOOLEAN((t) -> {
        if(!t.equalsIgnoreCase("true") && !t.equalsIgnoreCase("false")) {
            throw new IllegalArgumentException("Erro ao converter em null");
        }
        return Boolean.parseBoolean(t);
    });

    private final Function<String, Object> action;

    ValidadorTipos(Function<String, Object> action) {
        this.action = action;
    }

    public Object apply(String texto) {
        try {
            return this.action.apply(texto);
        } catch (DateTimeException | IllegalArgumentException ex) {
            System.out.println("Ocorreu erro na conversão dos tipos");
            return null;
        }
    }

}