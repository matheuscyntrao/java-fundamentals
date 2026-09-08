package br.com.exercisesdio.exercise5.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {

        static void main(String[] args) {

            //Stream
            List<IProduto> carrinho = List.of(
                    new Alimentacao(100.0),
                    new SaudeBemEstar(200.0),
                    new Vestuario(150.0),
                    new Cultura(50.0)
            );

            double totalImposto = carrinho.stream()
                    .mapToDouble(IProduto::valorImposto)
                    .sum();

            System.out.printf("Total de impostos a pagar: R$ %.2f%n", totalImposto);

            // Lambda
            List<IProduto> produtosLambda = new ArrayList<>();
            produtosLambda.add(new Alimentacao(200.0));
            produtosLambda.add(new SaudeBemEstar(1.0));
            produtosLambda.add(new Vestuario(3.00));
            produtosLambda.add(new Cultura(150.00));
            produtosLambda.forEach( p -> System.out.println(p.valorImposto()));

        }

}
