package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;
import br.com.fiapride.model.Sensor; // Importando o Sensor!

public class SistemaPrincipal {
    public static void main(String[] args) {

        // 1. Criando os sensores para as nossas geladeiras antigas
        Sensor sensorBrastemp = new Sensor("Termostato Digital V1", true);
        Sensor sensorElectrolux = new Sensor("Sensor Analógico Básico", true);

        // 2. Criando a primeira geladeira (agora passando o sensor junto!)
        Geladeira geladeira1 = new Geladeira("Brastemp", 400, sensorBrastemp);
        System.out.println("Adicionando itens na geladeira 1");
        geladeira1.adicionarItens(50);

        // 3. Criando a segunda geladeira (passando o outro sensor)
        Geladeira geladeira2 = new Geladeira("Electrolux", 300, sensorElectrolux);
        System.out.println("Adicionando itens na geladeira 2");
        geladeira2.adicionarItens(12);

        System.out.println("\n--- Sistema de Controle de Eletrodomésticos ---");

        System.out.println("Geladeira: " + geladeira1.getMarca() + " | Ocupação: " + geladeira1.getCapacidadeAtual() + " | Máx: " + geladeira1.getCapacidadeMaxima());
        System.out.println("Geladeira: " + geladeira2.getMarca() + " | Ocupação: " + geladeira2.getCapacidadeAtual() + " | Máx: " + geladeira2.getCapacidadeMaxima() + "\n");

        System.out.println("Ajustando a temperatura da geladeira 1");
        geladeira1.ajustarTemperatura(5);
    }
}