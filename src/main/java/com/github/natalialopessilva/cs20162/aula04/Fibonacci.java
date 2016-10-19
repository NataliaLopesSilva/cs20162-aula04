package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Fibonacci
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class Fibonacci {

    /**
     * Construtor da classe.
     */
    protected Fibonacci() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
    }

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR = 2;

    /**
     * Verifica qual é o n-ésimo número de Fibonacci.
     *
     * @param n O n-ésimo número de Fibonacci. Valor maior ou igual a 0.
     *
     * @return o logaritmo de n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 0).
     */
    public static int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que"
                    + " zero");
        }

        int a = 0, c = 1;

        if (n < CONTADOR) {
            return n;
        }

        int t = 0, i = CONTADOR;

        while (i <= n) {
            t = c;
            c = c + a;
            a = t;
            i++;
        }

        return c;
    }
}
