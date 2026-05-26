package model;

import enums.FormaPagamento;

public class Venda {

    private Produto produto;
    private int quantidade;
    private double valorTotal;
    private FormaPagamento formaPagamento;

    public Venda(Produto produto,
                 int quantidade,
                 FormaPagamento formaPagamento) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;

        this.valorTotal =
                produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produto=" + produto.getNome() +
                ", quantidade=" + quantidade +
                ", valorTotal=" + valorTotal +
                ", formaPagamento=" + formaPagamento +
                '}';
    }
}