package Questao11;

public class FuncionarioHorista extends Funcionario{
    private Double valor;
    private final Double taxa = 3.15;


    public FuncionarioHorista(String nome, String cpf, String rg){
        super(nome, cpf, rg);
    }

    @Override
    public void CalcularSalario() {
        valor *= taxa;
    }
}
