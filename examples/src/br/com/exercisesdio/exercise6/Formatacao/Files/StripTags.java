package br.com.exercisesdio.exercise6.Formatacao.Files;

public class StripTags {

    public static String limparChave(String str) {
        if (str == null) return "campo";
        String chaveLimpa = str.replaceAll("[^a-zA-Z0-9_-]", "_");
        if (chaveLimpa.matches("^[0-9-].*")) {
            chaveLimpa = "_" + chaveLimpa;
        }
        return chaveLimpa.isEmpty() ? "campo" : chaveLimpa;
    }

    public static String limparValor(Object obj) {
        if (obj == null) return "";
        String texto = String.valueOf(obj);
        return texto.replaceAll("<[^>]*>", "");
    }

}
