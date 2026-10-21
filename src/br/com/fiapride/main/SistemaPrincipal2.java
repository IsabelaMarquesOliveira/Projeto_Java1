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

        Frigobar meuFrigobar = new Frigobar("Consul", 120, sensorComum, true);
        GeladeiraInteligente minhaSmart = new GeladeiraInteligente("Samsung", 500, sensorSmart, true);

        List<Geladeira> listaDeEletrodomesticos = new ArrayList<>();
        listaDeEletrodomesticos.add(meuFrigobar);
        listaDeEletrodomesticos.add(minhaSmart);

        System.out.println("--- Teste Final do Sistema (Polimorfismo e Abstração) ---");

        for (Geladeira eletro : listaDeEletrodomesticos) {
            System.out.println("\nEquipamento: " + eletro.getMarca());

            double consumo = eletro.calcularConsumoEnergia();
            System.out.println("Consumo mensal estimado: " + consumo + " kWh");

            eletro.realizarDegelo();
        }
    }
}