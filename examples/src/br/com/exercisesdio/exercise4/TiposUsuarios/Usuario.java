package br.com.exercisesdio.exercise4.TiposUsuarios;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean isAdministrador;
    private boolean isLogado = false;

    public Usuario(String nome, String email, String senha, boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha= senha;
        this.isAdministrador = isAdministrador;
    }

    public void realizarLogin() {
        System.out.println("Login efetuado");
        this.isLogado = true;
    }

    public void realizarLogoff() {
        if(isLogado) {
            System.out.println("Logout efetuado");
            this.isLogado = false;
        }
        else {
            System.out.println("Usuário não está logado");
        }
    }

    public void alterarDados(String nome, String email, String senha) {
        this.setNome(nome);
        this.setEmail(email);
        this.alterarSenha(senha);
    }

    public void alterarSenha(String senha) {
        this.setSenha(senha + "ENCRYPT");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getIsAdministrador() {
        return this.isAdministrador;
    }

}
