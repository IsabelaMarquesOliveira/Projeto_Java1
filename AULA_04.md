# 🏗️ Aula 04: Construtores e Estado Inicial

Nesta etapa, a arquitetura da classe foi aprimorada com a implementação de um **Construtor** personalizado. O objetivo principal é garantir que nenhum objeto seja instanciado em um estado inválido ou incompleto na memória.

### Conceitos Aplicados:

* **Instanciação Segura (Obrigatoriedade):** O construtor foi configurado para exigir a passagem obrigatória dos atributos essenciais (`marca` e `capacidadeMaxima`) no exato momento em que o objeto é criado (utilizando o comando `new`).
* **Validação no Nascimento:** Uma excelente prática de engenharia de software foi aplicada: as atribuições dentro do construtor são realizadas através da chamada dos métodos `Setters` (ex: `this.setMarca(...)`). Isso garante que as regras de segurança e encapsulamento (da Aula 03) blindem o objeto desde a sua inicialização.
* **Estado Padrão de Fábrica:** Atributos operacionais, como `temperaturaAtual` e `capacidadeAtual`, são inicializados automaticamente de forma estruturada com valores seguros predefinidos (ex: 4°C e ocupação zero), sem precisar que o usuário os informe na criação.

---
[⬅️ Voltar para o Início](README.md)