package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Raiz Quadrada.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class RaizQuadrada {

    /**
     * Construtor da classe.
     */
    protected RaizQuadrada() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setRaizQuadrada() {
        RaizQuadrada raizQuadrada = new RaizQuadrada();
    }

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR_DOIS = 2;

    /**
     * Verifica a raiz quadrada de um número.
     *
     * @param n O número a ser levado a raiz quadrada. Valor maior que 1.
     * @param m O número de maior aproximação desejada.
     *
     * @return a raiz quadrada de n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 0).
     */
    public static double raizQuadrada(final int n, final int m) {

        if (n < 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que"
                    + " zero");
        }

        double r = 1;
        int i = m;

        while (i >= 0) {

            r = (r + (n / r)) / 2;
            i--;
        }

        return r;
    }
}
