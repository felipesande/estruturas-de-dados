# 📚 Abstração e POO aplicadas à Estrutura de Dados

Este conteúdo é a base para compreender estruturas como **listas encadeadas, pilhas e filas**.

---

# 1️⃣ O que é Abstração?

**Abstração** é o processo de esconder detalhes internos e mostrar apenas o essencial.

Exemplo:

Controle remoto 📺

Você sabe:
- botão Power liga a TV

Você não precisa saber:
- circuitos internos
- sinais infravermelhos
- funcionamento eletrônico

Na computação:

Abstração permite criar um **TAD (Tipo Abstrato de Dados)**

---

## O que é um TAD?

Define:

✔ o que a estrutura faz  
❌ não como ela faz  

Exemplo:

Lista encadeada possui:

- inserir()
- remover()
- buscar()

Sem revelar:

- ponteiros
- organização da memória

---

# 2️⃣ Classe vs Objeto

## Classe

Classe = molde

Define:

- atributos
- métodos

Não ocupa memória ainda.

Exemplo:

class No

---

## Objeto

Objeto = instância da classe

Criado com:

No novoNo = new No()

Agora sim:

📍 memória RAM é reservada

---

## Visualização mental correta

Classe:

Projeto do vagão 🚃

Objeto:

Vagão construído

---

# 3️⃣ Atributos e Métodos

## Atributos

Representam:

o que o objeto tem

Exemplo:

int dado  
No proximo

---

## Métodos

Representam:

o que o objeto faz

Exemplo:

getDado()  
setProximo()

---

# 4️⃣ Encapsulamento

Encapsular significa:

proteger os dados internos do objeto

Regra:

Nunca deixar ponteiros públicos

Errado:

public No proximo

Certo:

private No proximo

Acesso permitido apenas via:

getters  
setters

Evita:

- corrupção da lista
- perda de referências
- erros difíceis de detectar

---

# 5️⃣ Exemplo correto da classe No

```java
public class No {

    private int dado;
    private No proximo;

    public No(int valor) {
        this.dado = valor;
        this.proximo = null;
    }

    public int getDado() {
        return dado;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }
}
```
Essa classe representa:
🧱 a peça básica de listas encadeadas

---

### 6️⃣ Referências (ponteiros em Java)

Esse é um dos pontos que mais derrubam alunos.  
Quando fazemos: `No A = B;`

Não acontece cópia. Acontece:  
`A ──► mesmo endereço de memória que B`

**Consequência:** Alterar B altera A também.

---

### 7️⃣ O valor null

Outro erro clássico de prova.  
`No no = null;` significa:  
* não aponta para lugar nenhum

**Erro típico:** `no.getProximo().getDado()`  
Se `getProximo() == null`, o resultado é:  
💥 **NullPointerException**

---

### 8️⃣ O conceito de this

`this` significa:  
* este objeto atual

Exemplo: `this.proximo = proximo;` significa que o próximo **deste objeto** será o parâmetro recebido.  
Sem `this`, o compilador pode confundir o atributo da classe vs variável do método.

---

### 9️⃣ Construtores (Inicialização segura)

**Construtor:** Executa automaticamente quando objeto nasce.  
Exemplo: `new No(10)` chama `public No(int valor)`.  

**Função:** Garantir que o objeto nunca exista com valores indefinidos.  
**Regra de ouro:** Objeto nunca deve nascer “sujo”.

---

### 🔟 Sobrecarga de construtores (Overloading)

* Mesmo nome  
* Parâmetros diferentes  

Exemplo:
```java
public No(int dado) {
    this.dado = dado;
}

public No(int dado, No proximo) {
    this.dado = dado;
    this.proximo = proximo;
}
```

Benefício: Flexibilidade na criação de objetos.

### 1️⃣1️⃣ static vs instância
Erro MUITO comum em prova.
* **Atributo de instância:** Cada objeto tem o seu. Exemplo: `private int dado;`. Cada nó terá um valor diferente.
* **Atributo static:** Pertence à classe inteira. Exemplo: `static int contador;`. Todos os objetos compartilham.

🚨 **Nunca usar static em ponteiros de listas** Errado: `static No proximo`. Isso faria todos os nós apontarem para o mesmo endereço, quebrando a estrutura inteira.

### 1️⃣2️⃣ Passagem por valor vs referência em Java
* **Tipos primitivos (int, double, boolean):** Passagem por **valor** (cópia).
* **Objetos:** Passagem por **cópia da referência**. Significa que você altera o objeto original.
Exemplo: `alterar(no)` muda o objeto real na memória.

### 1️⃣3️⃣ Composição vs Agregação
Muito cobrado em prova teórica.
* **Composição:** Relação forte. Exemplo: **Lista → Nós**. Se a lista desaparece, os nós deixam de fazer sentido.
* **Agregação:** Relação fraca. Exemplo: **Curso → Alunos**. Curso acaba, mas os alunos continuam existindo.

### 1️⃣4️⃣ Garbage Collector (Coletor de lixo)
Java remove objetos automaticamente. Se ninguém aponta para um objeto ele é considerado um "Nó perdido".
Então, o **Garbage Collector** remove da memória.
* **Resposta correta em prova:** Remover nó = remover todas as referências para ele.

### 1️⃣5️⃣ Classe Gerenciadora (Container)
Estruturas reais não manipulam apenas nós isolados. Usam uma classe controladora.
Exemplo: `ListaEncadeada`

**Responsável por:**
* `inserir()`
* `remover()`
* `buscar()`

**Estrutura típica:**
Dentro dela existem os atributos `private No head;` e `private int tamanho;`.
* **Head:** Aponta para o primeiro elemento. Se a lista estiver vazia, `head == null`.
* **Size:** Armazena quantidade de elementos.
* **Vantagem:** Consulta em $O(1)$. Sem size, precisaria percorrer a lista em $O(n)$.

### 1️⃣6️⃣ Separação correta de responsabilidades
* **Classe No:** Só conhece dado e vizinho.
* **Classe Lista:** Sabe inserir, remover, buscar e tamanho.
* **Erro clássico:** Colocar lógica da lista dentro da classe No. Isso viola a abstração.

### 1️⃣7️⃣ Pegadinha da lista vazia
Sempre verificar `if(head == null)` antes de acessar `head.getProximo()`. Caso contrário, o programa quebra.

### 1️⃣8️⃣ Problema do “nó perdido”
Erro clássico: sobrescrever ponteiro antes de salvar referência.
* **Errado:** `atual.proximo = novo;` antes de salvar o `atual.proximo` original.
* **Certo:**
```java
No temp = atual.getProximo();
atual.setProximo(novo);
novo.setProximo(temp);
```

### 1️⃣9️⃣ Comparação: == vs .equals()
* **`==`**: Compara endereços de memória.
* **`.equals()`**: Compara o conteúdo.
* **Exemplo correto:** `if(no1.getDado() == no2.getDado())` ou usar o método `.equals()` se o dado for um objeto (como String).

---

### 🎯 Resumo estratégico para prova
Sempre lembrar:
* ✔ Verificar lista vazia
* ✔ Proteger atributos com `private`
* ✔ Usar classe gerenciadora
* ✔ Salvar ponteiros antes de alterar
* ✔ Entender referência ≠ cópia
* ✔ Diferenciar `static` de instância
* ✔ Usar `.equals()` para comparar conteúdo
