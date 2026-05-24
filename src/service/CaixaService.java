package service;

import model.Caixa;

public class CaixaService {

    private Caixa caixa;

    public CaixaService() {
        caixa = new Caixa(0);
    }

    public void adicionarVenda(double valor) {

        caixa.adicionarValor(valor);

        System.out.println("Valor adicionado ao caixa.");
    }

    public void mostrarSaldo() {

        System.out.println("Saldo atual do caixa: R$ " + caixa.getSaldo());
    }
}