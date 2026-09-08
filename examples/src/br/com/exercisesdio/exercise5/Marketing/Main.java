package br.com.exercisesdio.exercise5.Marketing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Mensagem> mensagens = new ArrayList<>();
        mensagens.add(new RedesSociais());
        mensagens.add(new SMS());
        mensagens.add(new Whatsapp());
        mensagens.add(new Email());
        mensagens.forEach( message -> message.sendMessage("Teste"));
    }

}
