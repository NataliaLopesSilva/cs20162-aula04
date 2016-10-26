/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Raiz Quadrada.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class RaizQuadrada {

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR_DOIS = 2;

    /**
     * Construtor da classe RaizQuadrada que impede que a mesma seja instanciada
     * ou acessada.
     */
    private RaizQuadrada() {
    }

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
