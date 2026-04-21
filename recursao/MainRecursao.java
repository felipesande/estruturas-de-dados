package recursao;

// Importamos a ferramenta de leitura
import java.util.Scanner;

public class MainRecursao {
    public static void main(String[] args) {
        // Criamos o scanner para ler a entrada do teclado
        Scanner leitor = new Scanner(System.in);
        Exercicio1 exercicio = new Exercicio1();
        boolean continuar = true; // Variável de controle do laço

        System.out.println("EXERCÍCIO 1");
        System.out.println("=== SISTEMA DE POTENCIAÇÃO RECURSIVA ===");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular nova potência");
            System.out.println("0 - Sair do programa");
            System.out.print("Opção: ");
            
            int opcao = leitor.nextInt();

            if (opcao == 1) {
                // Solicitando os dados
                System.out.println("Digite o valor da base (x): ");
                int base = leitor.nextInt();

                System.out.println("Digite o valor do expoente: ");
                int expoente = leitor.nextInt();

                // Verificação simples para evitar erro de recursão infinita com negativos
                if (expoente < 0) {
                    System.out.println("Erro: Este exemplo suporta apenas expoentes inteiros positivos.");
                } else {
                    // Chamada da função
                    int resultado = exercicio.calcularPotencia(base, expoente);
                    System.out.println(base + " elevado a " + expoente + " é " + resultado);
                }
            }
            else if (opcao == 0) {
                System.out.println("Encerrando o sistema... Até logo!");
                // Quebra o laço while
                continuar = false;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        // Sempre feche o scanner após o uso
        leitor.close();
    }      
}
