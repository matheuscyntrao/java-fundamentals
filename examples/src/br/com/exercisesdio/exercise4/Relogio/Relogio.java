package br.com.exercisesdio.exercise4.Relogio;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
    Escreve uma hierarquia de classes para criação de relógios para
    diferentes lugares do mundo, defina uma classe pai que tenha as
    propriedades Hora, minuto e segundo com seus respectivos getters
    e setters (atendendo as regras do funcionamento de um relógio)
    e um método que deverá retornar a hora no formato HH:MM:SS,
    a partir dessa classe crie 2 implementações, uma chamada relógio
    Americando e outra chamada relógio Brasileiro, lembrando que para
    o relógio americano não existem as horas de 13 até 24. Defina também
    na super classe um método que ficará por responsabilidade da classe
    que extende-la definir seu funcionamemnto, esse método deve receber um
    relógio ( independente da implementação) e deve-se extrair as informações
    dele e usa-la no objeto que recebeu para setar as novas informações do relógio.
 */
public abstract class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida! Deve ser entre 0 e 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minutos inválidos! Deve ser entre 0 e 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundos inválidos! Deve ser entre 0 e 59.");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHoraFormatada() {
        LocalTime tempo = LocalTime.of(this.hora, this.minuto, this.segundo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return tempo.format(formatter);
    }

    public abstract void sincronizar(Relogio clock);
}
