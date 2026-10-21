package br.com.fiapride.model;

public class GeladeiraInteligente extends Geladeira {

    private boolean conexaoWiFi;

    public GeladeiraInteligente(String marca, int capacidadeMaxima, Sensor sensorInterno, boolean conexaoWiFi) {
        super(marca, capacidadeMaxima, sensorInterno);
        this.conexaoWiFi = conexaoWiFi;
    }

    @Override
    public double calcularConsumoEnergia() {
        System.out.println("Calculando consumo elevado da Geladeira Smart (Wi-Fi e telas ativas)...");
        return 85.0;
    }

    @Override
    public void realizarDegelo() {
        System.out.println("Geladeira Smart: Sistema Frost Free ativado. Degelo automático e impercetível.");
    }

    public boolean isConexaoWiFi() {
        return conexaoWiFi;
    }

    public void setConexaoWiFi(boolean conexaoWiFi) {
        this.conexaoWiFi = conexaoWiFi;
    }
}