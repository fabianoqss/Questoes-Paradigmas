package Questao7;

import java.util.List;

public class Escola {
    private String nome;
    List<Professor> professores;

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void exibirProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

}
