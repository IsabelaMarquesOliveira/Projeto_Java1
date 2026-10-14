package br.com.fiapride.main;

import br.com.fiapride.model.Frigobar;
import br.com.fiapride.model.Geladeira;
import br.com.fiapride.model.GeladeiraInteligente;
import br.com.fiapride.model.Sensor;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal2 {
    public static void main(String[] args) {

        Sensor sensorComum = new Sensor("Termostato Simples", true);
        Sensor sensorSmart = new Sensor("Sensor Digital Wi-Fi", true);

        // Criando os três objetos diferentes
        Geladeira geladeiraPadrao = new Geladeira("Electrolux", 400, sensorComum);
        Frigobar meuFrigobar = new Frigobar("Consul", 120, sensorComum, true);
        GeladeiraInteligente minhaSmart = new GeladeiraInteligente("Samsung", 500, sensorSmart, true);

        // 4. Criando a Lista tipada com a Superclasse (Geladeira)
        List<Geladeira> listaDeEletrodomesticos = new ArrayList<>();
        listaDeEletrodomesticos.add(geladeiraPadrao);
        listaDeEletrodomesticos.add(meuFrigobar);
        listaDeEletrodomesticos.add(minhaSmart);

        System.out.println("--- Teste de Polimorfismo: Consumo de Energia ---");

        // Laço for iterando sobre a lista
        // A MÁGICA ACONTECE AQUI: A mesma linha de código executa lógicas diferentes!
        for (Geladeira eletro : listaDeEletrodomesticos) {
            System.out.println("\nEquipamento: " + eletro.getMarca());

            // O Java sabe exatamente qual calcularConsumoEnergia() chamar
            double consumo = eletro.calcularConsumoEnergia();

            System.out.println("Consumo mensal estimado: " + consumo + " kWh");
        }
    }
}