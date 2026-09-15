package br.com.exercisesdio.exercise6.Calculadora;

import java.util.function.BiFunction;

public enum Operacoes {

    SOMA((a,b) -> a + b),
    SUBTRACAO((a, b) -> a - b),
    MULTIPLICACAO((a, b) -> a * b),
    DIVISAO ((a, b) -> {
        if(b == 0 ) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    });

    final BiFunction<Double,Double,Double> action;

    Operacoes(BiFunction<Double, Double, Double> action) {
        this.action = action;
    }

    public Double apply(Double a, Double b) {
        return this.action.apply(a, b);
    }

}
