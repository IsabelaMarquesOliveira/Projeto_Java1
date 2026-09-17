package br.com.fiapride.model;

public class Geladeira {
    private String marca;
    private int temperaturaAtual;
    private int capacidadeAtual;
    private int capacidadeMaxima;

    // Associação com a nova classe Sensor
    private Sensor sensorInterno;

    // Construtor atualizado recebendo o Sensor
    public Geladeira(String marca, int capacidadeMaxima, Sensor sensorInterno) {
        this.setMarca(marca);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setSensorInterno(sensorInterno);

        this.setTemperaturaAtual(4);
        this.setCapacidadeAtual(0);
    }

    // Métodos de Ação
    public void ajustarTemperatura(int novaTemperatura) {
        this.setTemperaturaAtual(novaTemperatura);
    }

    public void adicionarItens(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("ERRO: Quantidade deve ser maior que zero.");
        } else if ((this.capacidadeAtual + quantidade) > this.capacidadeMaxima) {
            System.out.println("ERRO: Falta de espaço na geladeira!");
        } else {
            this.capacidadeAtual += quantidade;
            System.out.println("Itens adicionados. Ocupação atual: " + this.capacidadeAtual);
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        if (temperaturaAtual >= -5 && temperaturaAtual <= 10) {
            this.temperaturaAtual = temperaturaAtual;
        } else {
            System.out.println("ERRO DE SEGURANÇA: Tentativa de burlar o sistema! Valor de temperatura inválido no SET.");
        }
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Sensor getSensorInterno() {
        return sensorInterno;
    }

    public void setSensorInterno(Sensor sensorInterno) {
        this.sensorInterno = sensorInterno;
    }
}