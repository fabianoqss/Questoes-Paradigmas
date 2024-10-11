package Questao10;

public class Calculadora {
    private Integer valor;

    public Calculadora(int valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void somar(int a, int b) {
        valor = a + b;
    }
    public void somar(int a, int b, int c) {
        valor = a + b + c;
    }
}
