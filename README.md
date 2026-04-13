# Estruturas de Dados e Algoritmos (Java)

Este repositório é dedicado à implementação e ao estudo de estruturas de dados e algoritmos fundamentais. O objetivo é construir uma biblioteca própria de estruturas, focando em eficiência, manipulação de memória e lógica de programação.

---

## 🏗️ Estruturas Implementadas

### 1. Vetores (Arrays Dinâmicos)
A primeira estrutura desenvolvida simula o comportamento de um array dinâmico, gerenciando manualmente o índice e a capacidade.

**Funcionalidades:**
* **Inserção:** No final e em posições específicas (com deslocamento de elementos).
* **Busca:** Recuperação por índice ou verificação de existência por valor.
* **Redimensionamento:** Aumento automático da capacidade quando o limite físico é atingido.
* **Utilitários:** Método para retornar o tamanho real e exibição formatada.

---

## 📊 Progresso de Estudos

- [x] Vetores / Arrays Dinâmicos
- [ ] Listas Encadeadas (Linked Lists)
- [ ] Pilhas (Stacks)
- [ ] Filas (Queues)
- [ ] Árvores (Trees)
- [ ] Algoritmos de Ordenação (Bubble, Quick, Merge Sort)

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java
* **IDE:** VS Code
* **Versionamento:** Git & GitHub Desktop

---

## 🚀 Como Executar

Cada estrutura está organizada em seu respectivo pacote. Para testar a classe `Vetor`:

```java
import vetores.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Java");
        System.out.println(vetor);
    }
}
