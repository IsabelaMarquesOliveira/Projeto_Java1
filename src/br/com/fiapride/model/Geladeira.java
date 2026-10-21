package br.com.fiapride.model;

public abstract class Geladeira {
    private String marca;
    private int temperaturaAtual;
    private int capacidadeAtual;
    private int capacidadeMaxima;

    private Sensor sensorInterno;

    public Geladeira(String marca, int capacidadeMaxima, Sensor sensorInterno) {
        this.setMarca(marca);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setSensorInterno(sensorInterno);

        this.setTemperaturaAtual(4);
        this.setCapacidadeAtual(0);
    }

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

    public double calcularConsumoEnergia() {
        System.out.println("Calculando consumo médio de uma Geladeira padrão...");
        return 50.0;
    }

    // Método abstrato
    public abstract void realizarDegelo();

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
            System.out.println("ERRO: Valor de temperatura inválido no SET.");
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