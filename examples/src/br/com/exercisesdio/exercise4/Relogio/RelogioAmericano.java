package br.com.exercisesdio.exercise4.Relogio;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String getHoraFormatada() {
        LocalTime tempo = LocalTime.of(super.getHora(), super.getMinuto(), super.getSegundo());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return tempo.format(formatter);
    }

    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

}
