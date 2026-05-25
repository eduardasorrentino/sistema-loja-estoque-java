package controller;

import model.Produto;
import service.ProdutoService;
import service.VendaService;

public class VendaController {

    private ProdutoService produtoService = new ProdutoService();
    private VendaService vendaService = new VendaService();

    public void executar() {

        Produto produto1 = new Produto(1, "Notebook", 3500, 10);
        Produto produto2 = new Produto(2, "Mouse", 120, 30);

        produtoService.cadastrarProduto(produto1);
        produtoService.cadastrarProduto(produto2);

        vendaService.realizarVenda(produto1, 1);
        vendaService.realizarVenda(produto2, 5);

        vendaService.relatorioVendas();

        vendaService.produtosMaisVendidos();

        vendaService.emitirCupomFiscal();

        vendaService.lucroMensal();
    }
}