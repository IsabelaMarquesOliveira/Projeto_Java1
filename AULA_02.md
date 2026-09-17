# ⚙️ Aula 02: Comportamentos e Regras de Negócio

Nesta etapa do projeto, saímos da estrutura básica e implementamos os primeiros **métodos de ação** do objeto. O objetivo foi estabelecer regras de negócio fundamentais por meio de estruturas condicionais (`if/else`), garantindo que a geladeira reaja de forma lógica às interações.

### Métodos Implementados:

* **`adicionarItens(int quantidade)`**:
  Método responsável por gerenciar o volume interno. Possui validações para:
    1. Impedir a inserção de valores negativos ou zerados.
    2. Bloquear a ação caso a quantidade informada ultrapasse o limite físico da `capacidadeMaxima`.

* **`ajustarTemperatura(int novaTemperatura)`**:
  Método de controle térmico que implementa uma trava de segurança. Ele permite ajustes operacionais apenas dentro de um intervalo funcional preestabelecido pela regra de negócios.

---
[⬅️ Voltar para o Início](README.md)