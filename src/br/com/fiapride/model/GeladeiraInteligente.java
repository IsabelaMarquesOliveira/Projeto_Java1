package br.com.fiapride.model;

public class GeladeiraInteligente extends Geladeira {

    // Atributo exclusivo
    private boolean conexaoWiFi;

    // Construtor usando o super()
    public GeladeiraInteligente(String marca, int capacidadeMaxima, Sensor sensorInterno, boolean conexaoWiFi) {
        super(marca, capacidadeMaxima, sensorInterno);
        this.conexaoWiFi = conexaoWiFi;
    }

    // Getter e Setter
    public boolean isConexaoWiFi() {
        return conexaoWiFi;
    }

    public void setConexaoWiFi(boolean conexaoWiFi) {
        this.conexaoWiFi = conexaoWiFi;
    }
}
