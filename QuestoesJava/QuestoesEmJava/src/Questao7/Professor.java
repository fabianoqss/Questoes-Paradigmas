package Questao7;

import java.util.List;

public class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }
    public void exibeEscola() {
        for(Escola escola1 : escolas) {
            System.out.println(escola1.toString());
        }
    }
}
