package controller;

import service.CaixaService;

public class CaixaController {

    private CaixaService caixaService =
            new CaixaService();

    public void executar() {

        caixaService.adicionarValor(500);

        caixaService.retirarValor(100);

        caixaService.mostrarSaldo();
    }
}
