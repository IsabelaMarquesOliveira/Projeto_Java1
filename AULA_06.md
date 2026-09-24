# 🧬 Aula 06: Herança e Especialização de Classes

Nesta etapa, aplicamos um dos conceitos mais poderosos da Programação Orientada a Objetos: a **Herança**. O objetivo foi aplicar o reaproveitamento de código, transformando nossa classe original em uma "Superclasse" (mãe) e criando especializações (filhas) a partir dela.

### A Superclasse
A classe `Geladeira` assumiu o papel de classe base. Ela fornece todos os seus atributos estruturais (marca, capacidade, temperatura) e métodos de ação (ajustar temperatura, adicionar itens) automaticamente para os seus herdeiros.

### As Classes Filhas (Especializações)
Foram criadas duas novas classes que herdam de `Geladeira` utilizando a palavra-chave `extends`:

1. **`Frigobar`**: Representa uma versão compacta.
    * *Atributo Exclusivo:* `temFechadura` (boolean).
2. **`GeladeiraInteligente`**: Representa uma versão moderna e conectada.
    * *Atributo Exclusivo:* `conexaoWiFi` (boolean).

### Conceitos Técnicos Aplicados
* **`extends`**: Comando que estabelece a relação de herança. O herdeiro ganha acesso a tudo o que for público ou protegido na classe mãe.
* **`super()`**: Utilizado dentro do construtor das classes filhas para invocar o construtor da classe mãe. Isso garante que as rigorosas regras de inicialização criadas nas aulas anteriores (como a exigência da marca, capacidade e do objeto `Sensor`) sejam validadas antes mesmo do objeto filho existir.

---
[⬅️ Voltar para o Início](README.md)