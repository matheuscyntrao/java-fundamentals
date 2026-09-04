package br.com.exercisesdio.exercise3;

public class ContaCorrente {

    private double saldo;
    private double chequeEspecial;
    private final double limiteChequeEspecialOriginal;
    private boolean isChequeEspecial;

    public ContaCorrente(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.limiteChequeEspecialOriginal = chequeEspecial;
        this.isChequeEspecial = false;
    }

    public double consultarSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    public double consultarChequeEspecial() {
        return this.chequeEspecial;
    }

    public void depositarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        double usoChequeEspecial = limiteChequeEspecialOriginal - chequeEspecial;
        if (usoChequeEspecial > 0) {
            if (valor >= usoChequeEspecial) {
                this.chequeEspecial = limiteChequeEspecialOriginal;
                this.saldo += (valor - usoChequeEspecial);
                this.isChequeEspecial = false;
            } else {
                this.chequeEspecial += valor;
            }
        } else {
            this.saldo += valor;
        }
        System.out.printf("Depósito de R$ %.2f efetuado com sucesso.%n", valor);
    }

    public void sacarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f efetuado com sucesso.%n", valor);
        } else if (consultarSaldo() >= valor) {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            isChequeEspecial = true;
            System.out.printf("Saque de R$ %.2f efetuado utilizando cheque especial.%n", valor);
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        }
    }

    public void pagarBoleto(String linhaDigitavel, double valor) {
        System.out.printf("Processando boleto: %s%n", linhaDigitavel);
        sacarDinheiro(valor);
    }

    public boolean isUsingChequeEspecial() {
        return this.isChequeEspecial;
    }
}