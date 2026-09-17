package br.com.fiapride.main;

import br.com.fiapride.model.Geladeira;
import br.com.fiapride.model.Sensor; // Não esqueça de importar a classe nova!

public class SistemaPrincipal2 {
    public static void main(String[] args) {

        // 1º Passo: Criar o objeto associado primeiro (um sensor térmico comum)
        Sensor sensorTermico = new Sensor("DHT22", true);

        // 2º Passo: Criar a Geladeira injetando o sensor dentro do construtor
        Geladeira minhaGeladeira = new Geladeira("Brastemp", 400, sensorTermico);

        System.out.println("--- Teste de Associação de Objetos ---");
        System.out.println("Equipamento: " + minhaGeladeira.getMarca());

        // 4. Imprimindo um dado do objeto associado!
        // Olha a mágica: entramos na geladeira -> pegamos o sensor -> perguntamos o modelo dele
        System.out.println("Modelo do Sensor Termômetro: " + minhaGeladeira.getSensorInterno().getModelo());

        if(minhaGeladeira.getSensorInterno().isAtivo()) {
            System.out.println("Status: O sensor interno está LIGADO e monitorando.");
        }
    }
}

