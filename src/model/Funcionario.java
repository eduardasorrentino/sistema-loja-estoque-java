package model;

import enums.CargoFuncionario;
import enums.NivelAcesso;

public class Funcionario extends Usuario {

    private int id;
    private String nome;
    private CargoFuncionario cargo;

    public Funcionario(int id,
                       String nome,
                       CargoFuncionario cargo,
                       String login,
                       String senha) {

        super(login, senha, NivelAcesso.FUNCIONARIO);

        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public CargoFuncionario getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(CargoFuncionario cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", login='" + login + '\'' +
                '}';
    }
}