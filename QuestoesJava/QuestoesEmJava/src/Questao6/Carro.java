package Questao6;

public class Carro {
    private Motor motor;
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void ligarCarro() {
        motor.ligar();
    }
}
