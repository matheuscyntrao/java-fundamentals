package br.com.exercisesdio.exercise3;

public class ContaCorrente {

    private double saldo;
    private double chequeEspecial;
    private final double limiteChequeEspecialMaximo;
    private double taxaChequeEspecialPendente;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;

        if (saldoInicial <= 500.0) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = saldoInicial * 0.50;
        }

        this.limiteChequeEspecialMaximo = this.chequeEspecial;
        this.taxaChequeEspecialPendente = 0.0;
    }

    public double consultarSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    public double consultarChequeEspecial() {
        return this.chequeEspecial;
    }

    public double getTaxaChequeEspecialPendente() {
        return this.taxaChequeEspecialPendente;
    }

    public boolean isUsingChequeEspecial() {
        return this.chequeEspecial < this.limiteChequeEspecialMaximo;
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
            double valorSacadoChequeEspecial = valor - saldo;
            saldo = 0;
            chequeEspecial -= valorSacadoChequeEspecial;

            double taxaGerada = valorSacadoChequeEspecial * 0.20;
            taxaChequeEspecialPendente += taxaGerada;

            System.out.printf("Saque de R$ %.2f efetuado utilizando cheque especial.%n", valor);
            System.out.printf("Taxa de 20%% gerada sobre o limite usado: R$ %.2f%n", taxaGerada);
        } else {
            System.out.println("Saldo e limite de cheque especial insuficientes.");
        }
    }

    public void depositarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        double valorRestante = valor;
        double valorUsadoChequeEspecial = limiteChequeEspecialMaximo - chequeEspecial;

        if (taxaChequeEspecialPendente > 0) {
            if (valorRestante >= taxaChequeEspecialPendente) {
                valorRestante -= taxaChequeEspecialPendente;
                System.out.printf("Taxa de cheque especial cobrada: R$ %.2f%n", taxaChequeEspecialPendente);
                taxaChequeEspecialPendente = 0;
            } else {
                taxaChequeEspecialPendente -= valorRestante;
                System.out.printf("Pagamento parcial da taxa do cheque especial: R$ %.2f (Pendente: R$ %.2f)%n",
                        valorRestante, taxaChequeEspecialPendente);
                valorRestante = 0;
            }
        }

        if (valorRestante > 0 && valorUsadoChequeEspecial > 0) {
            if (valorRestante >= valorUsadoChequeEspecial) {
                valorRestante -= valorUsadoChequeEspecial;
                chequeEspecial = limiteChequeEspecialMaximo;
                System.out.printf("Limite de cheque especial recomposto em R$ %.2f.%n", valorUsadoChequeEspecial);
            } else {
                chequeEspecial += valorRestante;
                System.out.printf("Limite de cheque especial recomposto parcialmente em R$ %.2f.%n", valorRestante);
                valorRestante = 0;
            }
        }
        this.saldo += valorRestante;
        System.out.printf("Depósito finalizado. Saldo livre: R$ %.2f | Limite disponível: R$ %.2f%n",
                this.saldo, this.chequeEspecial);
    }

    public void pagarBoleto(String linhaDigitavel, double valor) {
        System.out.printf("Processando boleto (%s)...%n", linhaDigitavel);
        sacarDinheiro(valor);
    }
}