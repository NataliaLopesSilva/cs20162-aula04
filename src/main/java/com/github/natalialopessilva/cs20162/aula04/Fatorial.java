package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Fatorial.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class Fatorial {

    /**
     * Construtor da classe.
     */
    protected Fatorial() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setFatorial() {
        Fatorial fatorial = new Fatorial();
    }

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR = 2;

    /**
     * Verifica o fatorial de um número.
     *
     * @param n O número de entrada. Valor maior 1.
     *
     * @return A entrada em fatorial.
     *
     * @throws IllegalArgumentException Se n for inválido (maior que 1).
     */
    public static int calculaFatorial(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n deve ser maior "
                    + " que 1");
        }

        int i = CONTADOR, f = 1;

        do {
            f = f * i;
            i = i + 1;

        } while (i <= n);

        return f;
    }
}
