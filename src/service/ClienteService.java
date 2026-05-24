package service;

import model.Cliente;

import java.util.ArrayList;

public class ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {

        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarCliente(int id) {

        for (Cliente cliente : clientes) {

            if (cliente.getId() == id) {
                return cliente;
            }
        }

        return null;
    }

    public void editarCliente(int id, String novoNome, String novoTelefone) {

        Cliente cliente = buscarCliente(id);

        if (cliente != null) {

            cliente.setNome(novoNome);
            cliente.setTelefone(novoTelefone);

            System.out.println("Cliente atualizado com sucesso!");

        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void removerCliente(int id) {

        Cliente clienteRemover = buscarCliente(id);

        if (clienteRemover != null) {

            clientes.remove(clienteRemover);

            System.out.println("Cliente removido com sucesso!");

        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}