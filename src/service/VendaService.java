package service;

import enums.FormaPagamento;
import model.Produto;
import model.Venda;

import java.util.ArrayList;
import java.util.HashMap;

public class VendaService {

    private ArrayList<Venda> vendas = new ArrayList<>();

    public void realizarVenda(Produto produto,
                              int quantidade,
                              FormaPagamento formaPagamento) {

        if (produto.getQuantidadeEstoque() < quantidade) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        produto.setQuantidadeEstoque(
                produto.getQuantidadeEstoque() - quantidade
        );

        Venda venda =
                new Venda(
                        produto,
                        quantidade,
                        formaPagamento
                );

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

    public void emitirCupomFiscal() {

        System.out.println("\n===== CUPOM FISCAL =====");

        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada.");
            return;
        }

        double total = 0;

        for (Venda venda : vendas) {

            System.out.println(
                    "Produto: " + venda.getProduto().getNome()
                            + " | Quantidade: " + venda.getQuantidade()
                            + " | Valor: R$ " + venda.getValorTotal()
                            + " | Pagamento: " + venda.getFormaPagamento()
            );

            total += venda.getValorTotal();
        }

        System.out.println("----------------------------");
        System.out.println("TOTAL DA COMPRA: R$ " + total);
    }

    public void lucroMensal() {

        System.out.println("\n===== LUCRO MENSAL =====");

        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada.");
            return;
        }

        double lucro = 0;

        for (Venda venda : vendas) {

            lucro += venda.getValorTotal();
        }

        System.out.println("Lucro total do mês: R$ " + lucro);
    }
}