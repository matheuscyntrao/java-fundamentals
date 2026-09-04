package br.com.exercisesdio.exercise3;
/*
        Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
        Ligar o carro;
        Desligar o carro;
        Acelerar;
        diminuir velocidade;
        virar para esquerda/direita
        verificar velocidade;
        trocar a marcha

    Siga as seguintes regras na implementação

    o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
    A velocidade do carro deve respeitar os seguintes limites para cada velocidade
        se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
        se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
        se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
        se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
        se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
        se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
        se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
    O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
    O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
 */
public class Carro {

    private boolean isIgnicao;
    private int velocidade;
    private int marcha;

    private final int LIMITE_MAXIMO_VELOCIDADE = 120;
    private final int LIMITE_MINIMO_VELOCIDADE = 0;
    private final int TOTAL_MARCHAS = 6;


    public Carro() {
        this.isIgnicao = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void trocarMarcha(int marcha) {
        if(this.isIgnicao) {
            if(this.marcha == (marcha -1) && marcha <= TOTAL_MARCHAS) {
                this.marcha++;
            } else if (this.marcha == (marcha + 1) && marcha >= 0) {
                this.marcha--;
            } else {
                System.out.println("Você não pode pular marchas, o carro está atualmente na " + this.marcha);
            }
        }
    }

    public void ligarCarro() {
        if(!this.isIgnicao) {
            this.isIgnicao = true;
            System.out.println("Carro ligado.");
        }
    }

    public void desligarCarro() {
        if(this.isIgnicao && this.velocidade == 0 && this.marcha == 0) {
            this.isIgnicao = false;
            System.out.println("Carro desligado.");
        }
    }

    public void acelerar () {
        if (!this.isIgnicao) {
            System.out.println("O carro está desligado.");
        } else if (this.velocidade >= LIMITE_MAXIMO_VELOCIDADE) {
            System.out.println("Limite de velocidade do carro atingido");
        } else if (verificarLimiteVelocidade(this.velocidade + 1)) {
            this.velocidade++;
            System.out.println("Acelerando - velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Suba a marcha para conseguir aumentar a velocidade. Limite da marcha atual atingido.");
        }
    }

    public void desacelerar() {
        if (!this.isIgnicao) {
            System.out.println("Não é possível desacelerar: o carro está desligado.");
        } else if (this.velocidade <= LIMITE_MINIMO_VELOCIDADE) {
            System.out.println("O carro já está parado.");
        } else if (verificarLimiteVelocidade(this.velocidade - 1)) {
            this.velocidade--;
            System.out.println("Desacelerando - velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Reduza a marcha para conseguir diminuir a velocidade de forma segura.");
        }
    }

    private boolean verificarLimiteVelocidade(int velocidadeFutura) {
        if (this.isIgnicao) {
            switch (this.marcha) {
                case 0:
                    return velocidadeFutura == 0;
                case 1:
                    return velocidadeFutura >= 0 && velocidadeFutura <= 20;
                case 2:
                    return velocidadeFutura >= 21 && velocidadeFutura <= 40;
                case 3:
                    return velocidadeFutura >= 41 && velocidadeFutura <= 60;
                case 4:
                    return velocidadeFutura >= 61 && velocidadeFutura <= 80;
                case 5:
                    return velocidadeFutura >= 81 && velocidadeFutura <= 100;
                case 6:
                    return velocidadeFutura >= 101 && velocidadeFutura <= 120;
                default:
                    return false;
            }
        } else {
            System.out.println("Ligue o carro antes de trocar a marcha");
        }
        return false;
    }

    public void virarDirecao(String direcao) {
        if (this.isIgnicao && this.velocidade >= 1 && this.velocidade <= 40) {
            switch(direcao) {
                case "esquerda": System.out.println("Carro virando para a esquerda"); break;
                case "direita" : System.out.println("Carro virando para a direita"); break;
                default: System.out.println("Direção não reconhecida");
            }
        } else if (!this.isIgnicao) {
            System.out.println("O carro está desligado");
        } else {
            System.out.println("Não é possível virar à esquerda/direita devido ao limite de velocidade.");
        }
    }


    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();
        carro.trocarMarcha(1);
        carro.virarDirecao("direita");
        carro.ligarCarro();
        carro.acelerar();
        carro.trocarMarcha(1);
        for (int i = 0; i < 22; i++) {
            carro.acelerar();
        }
        carro.trocarMarcha(3);
        carro.virarDirecao("esquerda");
        carro.trocarMarcha(2);
        carro.acelerar();
        carro.virarDirecao("direita");
        carro.desligarCarro();
    }

}
