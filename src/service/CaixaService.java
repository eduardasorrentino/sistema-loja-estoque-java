package service;

public class CaixaService {

    private double saldo = 0;

    public void adicionarValor(double valor) {

        saldo += valor;

        System.out.println("Valor adicionado ao caixa!");
    }

    public void retirarValor(double valor) {

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;

        System.out.println("Valor retirado do caixa!");
    }

    public void mostrarSaldo() {

        System.out.println("\n===== CAIXA =====");
        System.out.println("Saldo atual: R$ " + saldo);
    }
}