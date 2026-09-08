package br.com.exercisesdio.exercise5.Marketing;

public class Whatsapp implements Mensagem{

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem via Whatsapp " + message);
    }

}
