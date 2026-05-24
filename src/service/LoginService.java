package service;

import model.Usuario;

import java.util.ArrayList;

public class LoginService {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public LoginService() {

        usuarios.add(new Usuario("admin", "123", "ADMIN"));
        usuarios.add(new Usuario("funcionario", "456", "FUNCIONARIO"));
    }

    public boolean realizarLogin(String login, String senha) {

        for (Usuario usuario : usuarios) {

            if (usuario.getLogin().equals(login)
                    && usuario.getSenha().equals(senha)) {

                System.out.println("Login realizado com sucesso!");
                System.out.println("Nível de acesso: " + usuario.getNivelAcesso());

                return true;
            }
        }

        System.out.println("Login inválido.");

        return false;
    }
}