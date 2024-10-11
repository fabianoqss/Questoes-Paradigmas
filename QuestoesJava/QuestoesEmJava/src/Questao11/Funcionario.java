package Questao11;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String rg;

    public Funcionario(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public void CalcularSalario() {};
}
