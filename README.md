# Projeto: Controle de Eletrodomésticos (Geladeira) ❄️

Este projeto é uma aplicação feita em Java para praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)**, com foco em classes, atributos, métodos e proteção do estado (regras de negócio).

## 🌍 O que o objeto representa no mundo real?
A classe principal deste projeto representa uma **Geladeira**. Assim como no mundo real, nossa geladeira possui características físicas (como marca, temperatura e capacidade máxima em litros) e um espaço interno limitado. O sistema garante que as leis da física sejam respeitadas: não podemos colocar mais coisas do que a geladeira suporta e nem retirar coisas que não estão lá!

## ⚙️ Como a classe funciona?
A classe `Geladeira` foi construída com atributos para guardar o seu estado atual e um método construtor para prepará-la logo na "fábrica" (instanciação).

**Atributos:**
* `marca` (String)
* `capacidadeEmLitros` (int)
* `ocupacaoAtual` (int)
* `temperaturaAtual` (double)

## 🛠️ Como usar os Métodos

Os métodos foram criados para manipular a ocupação da geladeira com segurança:

### `guardarAlimento(int volume)`
Adiciona um volume (em litros) dentro da geladeira.
* **Regra 1:** Não aceita valores negativos ou zero.
* **Regra 2:** Verifica se a soma da `ocupacaoAtual` com o novo `volume` ultrapassa a `capacidadeEmLitros`. Se ultrapassar, a ação é bloqueada.

### `retirarAlimento(int volume)`
Retira um volume (em litros) de dentro da geladeira.
* **Regra 1:** Não aceita valores negativos ou zero.
* **Regra 2:** Verifica se há volume suficiente guardado para ser retirado. Se tentar tirar mais do que tem, a ação é bloqueada.



<img width="186" height="115" alt="{45B8D1B6-BC4C-4021-9BBC-0610BD5071C4}" src="https://github.com/user-attachments/assets/3deee6a7-727d-4dab-885c-2a98fa21293c" />
<img width="437" height="324" alt="{160B3002-0C10-4386-AA69-5A8C496D4F78}" src="https://github.com/user-attachments/assets/073352d4-464b-45e1-8255-ac3d63c7bb36" />

---
*Projeto desenvolvido como parte dos estudos de Java.*
