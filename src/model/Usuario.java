package model;

public class Usuario {

    protected String login;
    protected String senha;

    public Usuario(String login, String senha) {

        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}