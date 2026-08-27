package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal2 {
    public static void main(String[] args) {

        // Instanciando nossa geladeira
        Geladeira minhaGeladeira = new Geladeira("Brastemp", 100);

        System.out.println("--- Teste de Encapsulamento ---");
        System.out.println("Marca: " + minhaGeladeira.getMarca());
        System.out.println("Temperatura inicial: " + minhaGeladeira.getTemperaturaAtual() + "°C\n");

        // TENTATIVA DE BURLAR O SISTEMA (Missão 03)
        System.out.println(">> Tentando forçar a temperatura para -50°C pelo método SET:");

        // ATENÇÃO: Passando um número inteiro (-50) para bater com o tipo 'int' do Astah
        minhaGeladeira.setTemperaturaAtual(-50);

        System.out.println("\n>> Resultado:");
        System.out.println("A temperatura real da geladeira continua segura em: " + minhaGeladeira.getTemperaturaAtual() + "°C");
    }
}