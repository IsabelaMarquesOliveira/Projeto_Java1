# Projeto: Controle de Eletrodomésticos (Geladeira) ❄️

Este projeto é uma aplicação desenvolvida em Java com o objetivo de praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

## 🌍 O Objeto no Mundo Real
A classe principal deste projeto representa uma **Geladeira**. Assim como no mundo real, o eletrodoméstico possui características físicas (marca e capacidade máxima) e um espaço interno limitado. O sistema implementa regras de negócio rigorosas para garantir que o estado do objeto permaneça consistente, impossibilitando, por exemplo, o armazenamento acima de sua capacidade física.

---

## ⚙️ Aula 02: Comportamentos e Regras de Negócio
Nesta etapa, foram implementados os primeiros métodos de ação do objeto, estabelecendo regras de negócio fundamentais por meio de estruturas condicionais (`if/else`):

* **`adicionarItens(int quantidade)`:** Método responsável por gerenciar o volume interno. Possui validações para impedir a inserção de valores negativos ou zerados, e bloqueia a ação caso a quantidade informada ultrapasse o limite da `capacidadeMaxima`.
* **`ajustarTemperatura(int novaTemperatura)`:** Método de controle térmico que implementa uma trava de segurança, permitindo ajustes operacionais apenas no intervalo funcional estabelecido pela regra de negócios.

---

## 🔒 Aula 03: Encapsulamento e Proteção de Dados
Nesta etapa, a arquitetura do projeto foi atualizada para aplicar o conceito de **Encapsulamento**, garantindo a segurança e a integridade dos dados:

* Todos os atributos da classe foram convertidos para a visibilidade `private`, impedindo alterações diretas no estado do objeto por agentes externos.
* Foram implementados os métodos de acesso padrão (`Getters` para leitura e `Setters` para escrita).

**Regra Especial de Segurança (Setter):**
* **`setTemperaturaAtual(int temperaturaAtual)`:** Este método tornou-se a única interface validada para alteração térmica. A regra de negócio foi migrada para este *Setter*, bloqueando qualquer tentativa de burlar o sistema com valores menores que -5°C ou maiores que 10°C.

**Estrutura de Atributos Privados:**
* `marca` (String)
* `temperaturaAtual` (int)
* `capacidadeAtual` (int)
* `capacidadeMaxima` (int)

---
*Projeto acadêmico desenvolvido em Java para o estudo de Programação Orientada a Objetos.*



<img width="186" height="115" alt="{45B8D1B6-BC4C-4021-9BBC-0610BD5071C4}" src="https://github.com/user-attachments/assets/3deee6a7-727d-4dab-885c-2a98fa21293c" />
<img width="437" height="324" alt="{160B3002-0C10-4386-AA69-5A8C496D4F78}" src="https://github.com/user-attachments/assets/073352d4-464b-45e1-8255-ac3d63c7bb36" />

---
*Projeto acadêmico desenvolvido em Java para o estudo de Programação Orientada a Objetos.*
