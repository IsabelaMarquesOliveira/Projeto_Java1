# 🔒 Aula 03: Encapsulamento e Proteção de Dados

Nesta etapa, a arquitetura do projeto foi atualizada para aplicar um dos pilares mais importantes da Orientação a Objetos: o **Encapsulamento**. A meta foi garantir a segurança e a integridade absoluta dos dados da Geladeira.

### O que foi feito:
* **Visibilidade Privada:** Todos os atributos da classe foram convertidos para `private`, impedindo alterações diretas no estado do objeto por agentes externos (ex: `geladeira.marca = "X"` não é mais permitido).
* **Getters e Setters:** Foram implementados os métodos de acesso padrão para leitura (`get`) e escrita (`set`).

### Regra Especial de Segurança:
* **`setTemperaturaAtual(int temperaturaAtual)`**: Este método tornou-se a única interface validada para alteração térmica. A regra de negócio foi migrada para este *Setter*, bloqueando qualquer tentativa de burlar o sistema com valores absurdos (menores que -5°C ou maiores que 10°C).

### Estrutura de Atributos Blindada:
* `- marca` (String)
* `- temperaturaAtual` (int)
* `- capacidadeAtual` (int)
* `- capacidadeMaxima` (int)

---
[⬅️ Voltar para o Início](README.md)