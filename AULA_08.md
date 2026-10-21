# 👻 Aula 08: Classes e Métodos Abstratos

Nesta etapa, elevámos o nível da arquitetura aplicando o conceito de **Abstração**. O objetivo foi garantir que a superclasse sirva apenas como um "molde" conceitual e não possa ser instanciada diretamente.

### A Classe Abstrata
A classe `Geladeira` foi transformada numa classe `abstract`. No mundo real do nosso sistema, não faz sentido fabricar e vender uma "Geladeira" genérica; vendemos sempre um modelo específico (Frigobar, Smart, etc.). Com esta alteração, o comando `new Geladeira(...)` foi bloqueado pelo compilador.

### O Método Abstrato (Contrato Rigoroso)
Foi criado o método abstrato `public abstract void realizarDegelo();`.
* Métodos abstratos não possuem corpo (lógica) na superclasse.
* Eles funcionam como um **contrato**: obrigam rigorosamente todas as subclasses (filhas) a implementarem o seu próprio comportamento.

### Implementações Específicas
As filhas implementaram o método abstrato à sua maneira:
* O `Frigobar` implementou a lógica de um degelo manual.
* A `GeladeiraInteligente` implementou a lógica de um sistema *Frost Free* automático.

---
[⬅️ Voltar para o Início](README.md)
