package br.com.exercisesdio.exercise6;

import java.util.Scanner;

public class Calculadora {

    public static Scanner scanner = new Scanner(System.in);

    public static Double valorValido() {
        System.out.println("Imprima um valor double válido:");
        while(!scanner.hasNextDouble()) {
            System.out.println("Valor inválido");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    static void main(String[] args) {
        int option = 0;
        Double a = 0.00;
        Double b = 0.00;
        boolean continuar = true;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - SOMA 2 - SUBTRACAO 3 - MULTIPLICACAO 4 - DIVISAO 0 - SAIR");
            while(!scanner.hasNextInt()) {
                System.out.println("Valor inválido");
                scanner.next();
            }
            option = scanner.nextInt();
            if(option >= 1 && option <= 4) {
                a = Calculadora.valorValido();
                b = Calculadora.valorValido();
                switch(option) {
                    case 1: System.out.printf("Soma de %s + %s = %s\n",a,b,Operacoes.SOMA.apply(a, b)); break;
                    case 2: System.out.printf("Subtração de %s - %s = %s\n",a,b,Operacoes.SUBTRACAO.apply(a, b)); break;
                    case 3: System.out.printf("Multiplicação de %s * %s = %s\n",a,b,Operacoes.MULTIPLICACAO.apply(a, b)); break;
                    case 4:
                        try {
                            System.out.printf("Divisão de %s / %s = %s\n", a, b, Operacoes.DIVISAO.apply(a, b));
                            break;
                        } catch (ArithmeticException ex) {
                            System.out.println(ex.getMessage());
                        }
                }
            } else if (option == 0){
                continuar = false;
            } else {
                System.out.println("Menu inexistente;");
            }
        } while(continuar);
        System.out.println("Encerrando calculadora");
    }

}
