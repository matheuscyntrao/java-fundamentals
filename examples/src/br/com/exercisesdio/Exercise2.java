package br.com.exercisesdio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    /*
    Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

    Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

    Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

    Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
     */

    static void main() {

        obesidade();

        var arr = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println("Informe um número:");
        var scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();
        for(Integer index : arr) {
            System.out.printf("%s vezes %s é %s \n", numero, index, numero * index);
        }
    }

    static void obesidade() {
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        if(imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade III (Mórbida)");
        }
    }

}
