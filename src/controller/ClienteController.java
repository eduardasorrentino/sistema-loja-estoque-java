package controller;

import model.Cliente;
import service.ClienteService;

public class ClienteController {

    private ClienteService clienteService =
            new ClienteService();

    public void executar() {

        Cliente cliente1 =
                new Cliente(
                        1,
                        "Maria",
                        "99999-9999"
                );

        clienteService.cadastrarCliente(cliente1);

        clienteService.listarClientes();
    }
}
