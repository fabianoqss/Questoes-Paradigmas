package Questao3;

public class ContaBancaria {
    private Double saldo;
    private String titular;

    public ContaBancaria(Double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }
}
