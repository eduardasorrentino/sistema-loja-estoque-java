package service;

import enums.CargoFuncionario;
import model.Funcionario;

import java.util.ArrayList;

public class FuncionarioService {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario) {

        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public Funcionario buscarFuncionario(int id) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getId() == id) {
                return funcionario;
            }
        }

        return null;
    }

    public void editarFuncionario(int id,
                                  String novoNome,
                                  CargoFuncionario novoCargo) {

        Funcionario funcionario = buscarFuncionario(id);

        if (funcionario != null) {

            funcionario.setNome(novoNome);
            funcionario.setCargo(novoCargo);

            System.out.println("Funcionário atualizado com sucesso!");

        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void removerFuncionario(int id) {

        Funcionario funcionarioRemover = buscarFuncionario(id);

        if (funcionarioRemover != null) {

            funcionarios.remove(funcionarioRemover);

            System.out.println("Funcionário removido com sucesso!");

        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}