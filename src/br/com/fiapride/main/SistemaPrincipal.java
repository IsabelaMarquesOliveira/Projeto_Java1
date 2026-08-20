package br.com.fiapride.main;

// Importamos a classe Geladeira para que o sistema a reconheça
import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.

        // Criando a primeira geladeira (Objeto 1)
        // Passamos a Marca e a Capacidade Total em Litros no construtor
        Geladeira geladeira1 = new Geladeira("Brastemp", 400);
        System.out.println("Guardando alimentos na geladeira 1");
        geladeira1.guardarAlimento(50); // Guardando 50 litros de volume

        // Criando a segunda geladeira (Objeto 2)
        Geladeira geladeira2 = new Geladeira("Electrolux", 300);
        System.out.println("Guardando alimentos na geladeira 2");
        geladeira2.guardarAlimento(12); // Guardando 12 litros de volume

        System.out.println("\n--- Sistema de Controle de Eletrodomésticos ---");
        System.out.println("Geladeira: " + geladeira1.marca + " | Ocupação: " + geladeira1.ocupacaoAtual + "L | Capacidade: " + geladeira1.capacidadeEmLitros + "L");
        System.out.println("Geladeira: " + geladeira2.marca + " | Ocupação: " + geladeira2.ocupacaoAtual + "L | Capacidade: " + geladeira2.capacidadeEmLitros + "L\n");

        System.out.println("Retirando alimentos da geladeira 1");
        geladeira1.retirarAlimento(20); // Vai funcionar, pois tem 50L guardados

        System.out.println("Retirando alimentos da geladeira 2");
        geladeira2.retirarAlimento(20);
    }
}



