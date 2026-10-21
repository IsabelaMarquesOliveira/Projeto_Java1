package br.com.fiapride.model;

public class Frigobar extends Geladeira {

    private boolean temFechadura;

    public Frigobar(String marca, int capacidadeMaxima, Sensor sensorInterno, boolean temFechadura) {
        super(marca, capacidadeMaxima, sensorInterno);
        this.temFechadura = temFechadura;
    }

    @Override
    public double calcularConsumoEnergia() {
        System.out.println("Calculando consumo reduzido do Frigobar compacto...");
        return 20.0;
    }

    @Override
    public void realizarDegelo() {
        System.out.println("Frigobar: O degelo é manual. Por favor, desligue o aparelho e aguarde o gelo derreter.");
    }

    public boolean isTemFechadura() {
        return temFechadura;
    }

    public void setTemFechadura(boolean temFechadura) {
        this.temFechadura = temFechadura;
    }
}