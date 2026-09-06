package br.com.exercisesdio.exercise4.TiposUsuarios;

public final class Atendente extends Usuario {

    private double valorCaixa;
    private boolean caixaAberto = true;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void receberPagamento(double pagamento) {
        if(this.caixaAberto) {
            this.setValorCaixa( this.getValorCaixa() + pagamento);
        } else {
            System.out.println("Pagamento não recebido, caixa fechado.");
        }
    }

    public void abrirCaixa() {
        if(!this.caixaAberto) {
            this.caixaAberto = true;
        }
        System.out.println("Caixa aberto!");
    }

    public void fecharCaixa() {
        this.caixaAberto = false;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
