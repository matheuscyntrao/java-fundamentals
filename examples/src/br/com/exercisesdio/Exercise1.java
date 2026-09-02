package br.com.exercisesdio;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/*
    Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

    Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

    fórmula: área=lado X lado

    Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

    fórmula: área=base X altura

    Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */
public class Exercise1 {

    static void main() {
        diferencaIdades();
        retangulo();
        quadrado();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite seu ano de nascimento");
        int idade = LocalDate.now().getYear() - scanner.nextInt();
        System.out.printf("Olá %s você tem %s anos", nome, idade);
    }

    static void quadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado de um quadrado");
        double lado = scanner.nextDouble();
        System.out.println("Área do quadrado: " + lado * lado);
    }

    static void retangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo");
        double base = scanner.nextDouble();
        System.out.println("Digite o lado do retângulo");
        double lado = scanner.nextDouble();
        System.out.println("Área do quadrado: " + base * lado);
    }

    public static class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public int getIdade() {
            return idade;
        }
    }

    static void diferencaIdades() {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite o nome da primeira pessoa");
        nome = scanner.next();
        System.out.println("Digite a idade da primeira pessoa");
        idade = scanner.nextInt();
        Pessoa p1 = new Pessoa(nome, idade);
        System.out.println("Digite o nome da segunda pessoa");
        nome = scanner.next();
        System.out.println("Digite a idade da segunda pessoa");
        idade = scanner.nextInt();
        Pessoa p2 = new Pessoa(nome, idade);
        StringBuilder mensagem = new StringBuilder("Diferença das idades é: ");
        int diferenca;
        if(p1.getIdade() > p2.getIdade()) {
            diferenca = p1.getIdade() - p2.getIdade();
            mensagem.append(diferenca);
        } else if (p2.getIdade() > p1.getIdade()) {
            diferenca = p2.getIdade() - p1.getIdade();
            mensagem.append(diferenca);
        } else {
            mensagem = new StringBuilder("Idades são iguais");
        }
        System.out.println(mensagem);
    }

}
