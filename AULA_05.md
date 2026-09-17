# 🔌 Aula 05: Associação de Objetos

Nesta etapa, o projeto evoluiu para demonstrar como sistemas complexos são construídos conectando peças menores. Aplicamos o conceito de **Associação** (Composição), provando que um objeto não precisa (e nem deve) fazer tudo sozinho.

### A Nova Classe: `Sensor`
Foi criada uma entidade completamente independente chamada `Sensor`, responsável por representar um termômetro digital.
* **Atributos:** `modelo` (String) e `ativo` (boolean).

### Conectando os Mundos
* **A Associação:** A classe `Geladeira` recebeu um novo atributo (`private Sensor sensorInterno;`), estabelecendo que "toda Geladeira *tem um* Sensor".
* **Injeção via Construtor:** O construtor da Geladeira foi atualizado. Agora, para fabricar uma Geladeira, o sistema obriga que um objeto `Sensor` já exista e seja instalado (passado como parâmetro) durante a criação.

### Teste de Integração
No método `main`, o teste comprovou a comunicação em cadeia: acessamos a Geladeira, solicitamos o Sensor associado a ela, e lemos o modelo desse Sensor de forma contínua e orientada a objetos:
`minhaGeladeira.getSensorInterno().getModelo()`

---
[⬅️ Voltar para o Início](README.md)