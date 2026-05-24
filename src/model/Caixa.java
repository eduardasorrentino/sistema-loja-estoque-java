package model;

public class Caixa {

    private double saldo;

    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarValor(double valor) {
        saldo += valor;
    }
}