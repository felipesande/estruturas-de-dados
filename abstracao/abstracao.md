# Estudo de Estrutura de Dados: Abstração

## 1. Definição de Abstração
É o processo de identificar as **características essenciais** de um objeto ou sistema e ignorar os detalhes complexos e irrelevantes. 

> **A ideia central:** Focar na funcionalidade principal sem se preocupar com os detalhes de como ela foi feita (implementação).

---

## 2. Abstração em Java
Em Java, aplicamos a abstração principalmente de duas formas:

* **Classes Abstratas (`abstract class`):**
    * Não podem ser instanciadas (você não pode dar um `new` nela).
    * Podem conter métodos **abstratos** (sem corpo) e métodos **concretos** (com corpo/lógica).
* **Interfaces (`interface`):**
    * Funcionam como um **contrato**.
    * Definem quais métodos uma classe deve ter, mas não fornece a implementação.

---

## 3. TAD (Tipo Abstrato de Dados)
Um **TAD** é uma estrutura de dados definida pelo seu comportamento (operações) do ponto de vista do usuário, e não pela sua implementação.

* **Exemplo:** Uma *Pilha* (Stack) é um TAD. Você sabe que pode "Empilhar" e "Desempilhar". Se por dentro ela usa um Array ou uma Lista Encadeada, isso é um detalhe de implementação que a abstração esconde.

---

## 4. Resumo
| Conceito | Foco |
| :--- | :--- |
| **Abstração** | O **que** um objeto faz. |
| **Implementação** | **Como** o objeto faz. |

A abstração é uma ferramenta poderosa para simplificar o desenvolvimento de software e tornar o código mais fácil de entender e manter.
