package recursao;

public class Exercicio1 {
    
    /**
     * Calcula x elevado a n de forma recursiva.
     * @param x A base
     * @param n O expoente
     * @return O resultado de x^n
     */

    public int calcularPotencia(int x, int n) {
        // 1. Caso Base: Todo número elevado a 0 é 1
        if (n == 0) {
            return 1;
        }
        // 2. Caso Recursivo: x^n = x * (x ** (n - 1))
        return x * calcularPotencia(x, n - 1);
    }
}
