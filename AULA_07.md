# ⚡ Aula 07: Polimorfismo

Nesta etapa, aplicamos o **Polimorfismo**, o conceito que permite que objetos de diferentes classes derivadas (filhas) sejam tratados como objetos da classe base (mãe), mas respondam de forma única e específica quando os mesmos comandos são executados.

### A Regra de Negócio: Consumo de Energia
* **Na Superclasse (`Geladeira`)**: Foi criado o método genérico `calcularConsumoEnergia()`, que estabelece um consumo base (50 kWh) para um refrigerador padrão.
* **Nas Subclasses**: O método foi sobrescrito usando a anotação `@Override`.
    * No `Frigobar`, a lógica foi alterada para refletir um consumo reduzido (20 kWh).
    * Na `GeladeiraInteligente`, a lógica foi alterada para refletir um consumo elevado devido aos recursos de Wi-Fi e sensores (85 kWh).

### A Mágica Acontecendo
No método `main`, criamos uma coleção `List<Geladeira>` e adicionamos instâncias das três classes (Geladeira, Frigobar e GeladeiraInteligente). Através de um laço `for`, iteramos sobre essa lista chamando o método `calcularConsumoEnergia()`.

O Java, dinamicamente em tempo de execução (*late binding*), identificou o tipo real de cada objeto na memória e executou a regra de cálculo específica de cada um, mesmo a lista estando tipada de forma genérica.

---
[⬅️ Voltar para o Início](README.md)