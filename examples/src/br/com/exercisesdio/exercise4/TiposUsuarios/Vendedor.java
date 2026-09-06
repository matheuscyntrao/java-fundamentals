package br.com.exercisesdio.exercise4.TiposUsuarios;

public final class Vendedor extends Usuario {

    private int totalVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int getTotalVendas() {
        return this.totalVendas;
    }

    public void vender() {
        this.totalVendas++;
    }

    public int consultarVendas() {
        return this.getTotalVendas();
    }

}
