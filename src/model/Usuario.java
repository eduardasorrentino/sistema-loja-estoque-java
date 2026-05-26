package model;

import enums.NivelAcesso;

public class Usuario {

    protected String login;
    protected String senha;
    protected NivelAcesso nivelAcesso;

    public Usuario(String login,
                   String senha,
                   NivelAcesso nivelAcesso) {

        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}