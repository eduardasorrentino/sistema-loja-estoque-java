package service;

public class LoginService {

    private String usuarioAdmin = "admin";
    private String senhaAdmin = "123";

    public boolean fazerLogin(String usuario, String senha) {

        if (usuario.equals(usuarioAdmin) && senha.equals(senhaAdmin)) {

            System.out.println("Login realizado com sucesso!");
            System.out.println("Nível de acesso: ADMIN");

            return true;
        }

        System.out.println("Usuário ou senha inválidos.");

        return false;
    }
}