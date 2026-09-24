package br.com.fiapride.model;

// 1. O 'extends' diz que o Frigobar é filho da Geladeira e herda tudo dela
public class Frigobar extends Geladeira {

    // 2. Atributo exclusivo (só o Frigobar tem)
    private boolean temFechadura;

    // 3. Construtor ajustado
    public Frigobar(String marca, int capacidadeMaxima, Sensor sensorInterno, boolean temFechadura) {
        // O super() chama o construtor da mãe (Geladeira) para montar a base
        super(marca, capacidadeMaxima, sensorInterno);

        // Depois, inicializa o que é exclusivo do filho
        this.temFechadura = temFechadura;
    }

    // Getter e Setter exclusivos do Frigobar
    public boolean isTemFechadura() {
        return temFechadura;
    }

    public void setTemFechadura(boolean temFechadura) {
        this.temFechadura = temFechadura;
    }
}
