package br.com.exercisesdio.exercise5.Marketing;

public class Email implements Mensagem {

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem por email " + message);
    }

}
