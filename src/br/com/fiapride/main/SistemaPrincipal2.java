package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal2 {
    public static void main(String[] args) {

        // 4. Instanciação corrigida, injetando os argumentos exigidos pelo construtor
        Geladeira minhaGeladeira = new Geladeira("Brastemp", 400);

        System.out.println("--- Validação de Instanciação e Construtor ---");
        System.out.println("Equipamento: " + minhaGeladeira.getMarca());
        System.out.println("Capacidade Máxima Operacional: " + minhaGeladeira.getCapacidadeMaxima() + "L");
        System.out.println("Temperatura inicial de fábrica: " + minhaGeladeira.getTemperaturaAtual() + "°C\n");

        System.out.println(">> Tentativa de ajuste térmico fora dos parâmetros (-50°C):");
        minhaGeladeira.setTemperaturaAtual(-50);

        System.out.println("\nEstado térmico protegido mantido em: " + minhaGeladeira.getTemperaturaAtual() + "°C");
    }
}

