package Questao12;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public Produto somar(Produto outroProduto) {
        double novoPreco = this.preco + outroProduto.getPreco();
        return new Produto("Combo de " + this.nome + " e " + outroProduto.nome, novoPreco);
    }
}
