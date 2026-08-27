package br.com.fiapride.model;

public class Geladeira {
    // 1. Atributos Privados (O sinal de "-" no seu Astah)
    private String marca;
    private int temperaturaAtual;
    private int capacidadeAtual;
    private int capacidadeMaxima;

    // Construtor
    public Geladeira(String marca, int capacidadeMaxima) {
        this.marca = marca;
        this.capacidadeMaxima = capacidadeMaxima;
        this.temperaturaAtual = 4; // Temperatura padrão
        this.capacidadeAtual = 0;  // Começa vazia
    }

    // 2. Seus métodos originais de ação
    public void ajustarTemperatura(int novaTemperatura) {
        if (novaTemperatura >= -5 && novaTemperatura <= 10) {
            this.temperaturaAtual = novaTemperatura;
            System.out.println("Sucesso! A temperatura foi ajustada para " + novaTemperatura + "°C.");
        } else {
            System.out.println("ERRO: Escolha um valor entre -5°C e 10°C.");
        }
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

    // ---------------------------------------------------------
    // 3. MÉTODOS GET E SET (Missão da Aula 03)
    // ---------------------------------------------------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    // REGRA ESPECIAL DA MISSÃO: Protegendo o SET da temperatura
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