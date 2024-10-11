package Questao1e2;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer velocidade = 0;

    public Carro(String marca, String modelo, Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVelocidade() {
        return velocidade;
    }


    public void acelerarVelocidade(int velocidade){
        this.velocidade+= velocidade;
    }
    public void frearVelocidade(int velocidade){
        this.velocidade-= velocidade;
    }
}
