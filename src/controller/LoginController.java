package controller;

import service.LoginService;

public class LoginController {

    private LoginService loginService =
            new LoginService();

    public void executar() {

        loginService.fazerLogin(
                "admin",
                "123"
        );
    }
}