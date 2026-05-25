package model;

public class Funcionario extends Usuario {

    private int id;
    private String nome;
    private String cargo;

    public Funcionario(int id,
                       String nome,
                       String cargo,
                       String login,
                       String senha) {

        super(login, senha);

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

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}