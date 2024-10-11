package Questao8;

import java.util.List;

public class Empresa {
    List<Empregado> empregados;

    public void exibirEmpregados(){
        for(Empregado empregado : empregados){
            System.out.println(empregado.getNome()
                    + " - " + empregado.getSalario()
                    + " - " + empregado.getCargo());
        }
    }
}
