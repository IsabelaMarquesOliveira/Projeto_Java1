package br.com.fiapride.model;

public class Sensor {
    // Atributos do Sensor
    private String modelo;
    private boolean ativo;

    // Construtor do Sensor
    public Sensor(String modelo, boolean ativo) {
        this.setModelo(modelo);
        this.setAtivo(ativo);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
