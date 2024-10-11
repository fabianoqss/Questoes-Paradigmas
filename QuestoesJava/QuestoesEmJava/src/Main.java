import Questao1e2.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Primeira Questão
        Carro carro = new Carro("Fiat", "Mobi", 2020);
        System.out.println(carro.getMarca() + "  " + carro.getModelo() + "  " + carro.getAno());

        //Segunda Questão
        carro.acelerarVelocidade(100);
        System.out.println(carro.getVelocidade() + " Km/h");
        carro.frearVelocidade(50);
        System.out.println(carro.getVelocidade() + " Km/h");

        //Terceira Questão
    }
}