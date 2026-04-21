# Recursão

## 1. Definição
Recursão é um método de resolução de problemas onde a solução depende de soluções para instâncias menores do mesmo problema. Na programação, ocorre quando uma **função chama a si mesma** diretamente ou indiretamente.

> "Para entender a recursão, você deve primeiro entender a recursão."

---

## 2. A Estrutura de um Algoritmo Recursivo
Para que uma recursão não rode infinitamente (causando o famoso erro `StackOverflowError`), ela precisa de duas partes obrigatórias:

1.  **Caso Base (Condição de Parada):** É a condição simples que pode ser resolvida sem recursão. É o que diz para a função parar de chamar a si mesma.
2.  **Caso Recursivo:** É a parte onde a função chama a si mesma com um argumento ligeiramente diferente, aproximando-se do Caso Base.

---

## 3. Exemplo Clássico: Fatorial
O fatorial de um número $n$ ($n!$) é o produto de todos os números inteiros positivos de 1 até $n$.
* Exemplo: $4! = 4 \times 3 \times 2 \times 1 = 24$

**Lógica Recursiva:**
* O fatorial de 4 é $4 \times \text{fatorial de 3}$.
* O fatorial de 3 é $3 \times \text{fatorial de 2}$.
* ... até chegar no fatorial de 0, que é 1 (Caso Base).

---

## 4. Prós e Contras
| Vantagens | Desvantagens |
| :--- | :--- |
| Código mais limpo e elegante. | Consome mais memória (uso da Stack). |
| Ideal para estruturas complexas (Árvores/Grafos). | Pode ser mais lento que um laço `for/while`. |
| Facilita a estratégia de "Dividir e Conquistar". | Risco de `StackOverflow` se não houver caso base. |

---

## 5. Resumo
A recursão é como um conjunto de bonecas russas (Matrioskas): para chegar na menor (caso base), você precisa abrir a maior, depois a próxima, e assim por diante. Ao fechar, você monta a solução completa.
