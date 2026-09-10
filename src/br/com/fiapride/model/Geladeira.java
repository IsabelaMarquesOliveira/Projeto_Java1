package br.com.fiapride.model;

public class Geladeira {
    private String marca;
    private int temperaturaAtual;
    private int capacidadeAtual;
    private int capacidadeMaxima;

    // Construtor da Aula 04 (Exigindo dados essenciais)
    public Geladeira(String marca, int capacidadeMaxima) {
        this.setMarca(marca);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setTemperaturaAtual(4); // Temperatura inicial de fábrica
        this.setCapacidadeAtual(0);  // Começa vazia
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    // Regra de segurança blindada no SET
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
}