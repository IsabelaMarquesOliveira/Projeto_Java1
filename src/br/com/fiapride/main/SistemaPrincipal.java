package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Criando a primeira geladeira
        Geladeira geladeira1 = new Geladeira("Brastemp", 400);
        System.out.println("Adicionando itens na geladeira 1");
        // O método agora se chama adicionarItens (igual ao seu Astah)
        geladeira1.adicionarItens(50);

        // Criando a segunda geladeira
        Geladeira geladeira2 = new Geladeira("Electrolux", 300);
        System.out.println("Adicionando itens na geladeira 2");
        geladeira2.adicionarItens(12);

        System.out.println("\n--- Sistema de Controle de Eletrodomésticos ---");

        // OLHA A MÁGICA AQUI: Em vez de geladeira1.marca, usamos geladeira1.getMarca()
        System.out.println("Geladeira: " + geladeira1.getMarca() + " | Ocupação: " + geladeira1.getCapacidadeAtual() + " | Máx: " + geladeira1.getCapacidadeMaxima());
        System.out.println("Geladeira: " + geladeira2.getMarca() + " | Ocupação: " + geladeira2.getCapacidadeAtual() + " | Máx: " + geladeira2.getCapacidadeMaxima() + "\n");

        System.out.println("Ajustando a temperatura da geladeira 1");
        geladeira1.ajustarTemperatura(5);
    }
}



