package main;

import model.Produto;
import service.ProdutoService;
import service.VendaService;

public class Main {

    public static void main(String[] args) {

        ProdutoService produtoService = new ProdutoService();
        VendaService vendaService = new VendaService();

        Produto produto1 = new Produto(1, "Notebook", 3500, 10);
        Produto produto2 = new Produto(2, "Mouse", 120, 30);

        produtoService.cadastrarProduto(produto1);
        produtoService.cadastrarProduto(produto2);

        vendaService.realizarVenda(produto1, 1);
        vendaService.realizarVenda(produto2, 5);

        vendaService.relatorioVendas();
    }
}