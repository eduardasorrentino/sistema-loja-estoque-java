package service;

import model.Produto;
import model.Venda;

import java.util.ArrayList;
import java.util.HashMap;

public class VendaService {

    private ArrayList<Venda> vendas = new ArrayList<>();

    public void realizarVenda(Produto produto, int quantidade) {

        if (produto.getQuantidadeEstoque() < quantidade) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        produto.setQuantidadeEstoque(
                produto.getQuantidadeEstoque() - quantidade
        );

        Venda venda = new Venda(produto, quantidade);
        vendas.add(venda);

        System.out.println("Venda realizada com sucesso!");
    }

    public void relatorioVendas() {

        System.out.println("\n===== RELATÓRIO DE VENDAS =====");

        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada.");
            return;
        }

        double totalVendas = 0;

        for (Venda venda : vendas) {

            System.out.println(venda);

            totalVendas += venda.getValorTotal();
        }

        System.out.println("\nTOTAL VENDIDO: R$ " + totalVendas);
    }

    public void produtosMaisVendidos() {

        System.out.println("\n===== PRODUTOS MAIS VENDIDOS =====");

        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada.");
            return;
        }

        HashMap<String, Integer> ranking = new HashMap<>();

        for (Venda v : vendas) {

            String nome = v.getProduto().getNome();
            int qtd = v.getQuantidade();

            ranking.put(nome, ranking.getOrDefault(nome, 0) + qtd);
        }

        for (String nome : ranking.keySet()) {
            System.out.println(nome + " -> " + ranking.get(nome) + " unidades");
        }
    }
}