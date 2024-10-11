package Questao11;

public class FuncionarioAssalariado extends Funcionario{
    private Double valor;
    private final Double taxa = 9.90;


    public FuncionarioAssalariado(String nome, String cpf, String rg){
        super(nome, cpf, rg);
    }

    @Override
    public void CalcularSalario() {
        valor *= taxa;
    }
}
