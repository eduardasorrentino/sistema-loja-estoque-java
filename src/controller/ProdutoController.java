package controller;

import model.Produto;
import service.ProdutoService;

public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

    public void executar() {

        Produto produto1 = new Produto(1, "Notebook", 3500, 10);
        Produto produto2 = new Produto(2, "Mouse", 120, 30);

        produtoService.cadastrarProduto(produto1);
        produtoService.cadastrarProduto(produto2);

        produtoService.relatorioEstoque();
    }
}