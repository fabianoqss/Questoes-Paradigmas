package Questao15;

public class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Tentativa de saque de " + valor + " com saldo de " + saldo);
        }
        saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }

}
