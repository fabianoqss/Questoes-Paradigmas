package Questao14;

public class Configuracao {
    private static volatile Configuracao instancia;

    private String config;

    private Configuracao() {
        this.config = "Configurações padrão";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            synchronized (Configuracao.class) {
                if (instancia == null) {
                    instancia = new Configuracao();
                }
            }
        }
        return instancia;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
