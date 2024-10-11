package Questao15;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
