package Questao6;

public  class Motor {
    private Integer potencia;
    private String tipo;

    public Motor(Integer potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public Integer getPotencia() {
        return potencia;
    }


    public String getTipo() {
        return tipo;
    }
    public void ligar() {
        System.out.println("O motor está ligado.");
    }
}
