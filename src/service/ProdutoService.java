package service;

import model.Produto;

import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void removerProduto(int id) {

        Produto produtoRemover = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public Produto buscarProduto(int id) {

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }

        return null;
    }

    public void editarProduto(int id, String novoNome, double novoPreco, int novoEstoque) {

        Produto produto = buscarProduto(id);

        if (produto != null) {

            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            produto.setQuantidadeEstoque(novoEstoque);

            System.out.println("Produto atualizado com sucesso!");

        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void relatorioEstoque() {

        System.out.println("\n===== RELATÓRIO DE ESTOQUE =====");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : produtos) {

            System.out.println(
                    "Produto: " + produto.getNome()
                            + " | Estoque: " + produto.getQuantidadeEstoque()
                            + " | Preço: R$ " + produto.getPreco()
            );
        }
    }
}