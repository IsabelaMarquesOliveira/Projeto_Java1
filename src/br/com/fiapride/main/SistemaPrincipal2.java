package br.com.fiapride.main;

import br.com.fiapride.model.Frigobar;
import br.com.fiapride.model.GeladeiraInteligente;
import br.com.fiapride.model.Sensor;

public class SistemaPrincipal2 {
    public static void main(String[] args) {

        Sensor sensorComum = new Sensor("Termostato Simples", true);
        Sensor sensorSmart = new Sensor("Sensor Digital Wi-Fi", true);

        // Criando a primeira filha (Frigobar)
        Frigobar meuFrigobar = new Frigobar("Consul", 120, sensorComum, true);

        // Criando a segunda filha (Geladeira Inteligente)
        GeladeiraInteligente minhaSmart = new GeladeiraInteligente("Samsung", 500, sensorSmart, true);

        System.out.println("--- Testando os Herdeiros ---");

        // Repare que estamos usando o getMarca(), que foi herdado da Geladeira!
        System.out.println("1. Frigobar da marca: " + meuFrigobar.getMarca());
        System.out.println("   Tem fechadura? " + (meuFrigobar.isTemFechadura() ? "Sim" : "Não"));

        System.out.println("\n2. Geladeira Smart da marca: " + minhaSmart.getMarca());
        System.out.println("   Está conectada no Wi-Fi? " + (minhaSmart.isConexaoWiFi() ? "Sim" : "Não"));

        // Provando a herança de métodos de ação da mãe
        System.out.println("\n--- Testando métodos herdados na Smart ---");
        minhaSmart.ajustarTemperatura(2);
        System.out.println("Temperatura da Smart ajustada para: " + minhaSmart.getTemperaturaAtual() + "°C");
        minhaSmart.adicionarItens(10);
    }
}

