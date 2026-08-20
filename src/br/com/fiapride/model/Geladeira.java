package br.com.fiapride.model;

public class Geladeira {
    // Atributos
    public String marca;
    public int capacidadeEmLitros;
    public int ocupacaoAtual; // Funciona como o "saldo" da geladeira
    public double temperaturaAtual;

    // Construtor: Prepara a geladeira na hora que ela é instanciada ("fabricada")
    public Geladeira(String marca, int capacidadeEmLitros) {
        this.marca = marca;
        this.capacidadeEmLitros = capacidadeEmLitros;
        this.ocupacaoAtual = 0; // Começa vazia
        this.temperaturaAtual = 4.0; // Temperatura padrão de fábrica
    }

    // Método equivalente ao "adicionarSaldo"
    public void guardarAlimento(int volume) {
        // Regra de negócio 1: O volume guardado deve ser positivo
        if (volume <= 0) {
            System.out.println("Erro: O volume a ser guardado deve ser maior que zero.");
            return; // Interrompe a execução do método
        }

        // Regra de negócio 2: Não pode estourar o limite de litros da geladeira
        if ((this.ocupacaoAtual + volume) > this.capacidadeEmLitros) {
            System.out.println("Erro: Espaço insuficiente. A geladeira não comporta essa quantidade.");
            return;
        }

        this.ocupacaoAtual += volume;
        System.out.println("Alimento guardado. Ocupação atual: " + this.ocupacaoAtual + " litros.");
    }

    // Método equivalente ao "pagarViagem"
    public void retirarAlimento(int volume) {
        // Regra de negócio 1: O volume retirado deve ser positivo
        if (volume <= 0) {
            System.out.println("Erro: O volume a ser retirado é inválido.");
            return;
        }

        // Regra de negócio 2: Não posso tirar mais coisas do que tem dentro da geladeira
        if (this.ocupacaoAtual < volume) {
            System.out.println("Erro: Não há volume suficiente dentro da geladeira para retirar.");
            return;
        }

        this.ocupacaoAtual -= volume;
        System.out.println("Alimento retirado. Ocupação restante: " + this.ocupacaoAtual + " litros.");
    }
}
