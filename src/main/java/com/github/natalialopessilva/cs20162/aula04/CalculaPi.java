/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Calculo de Pi.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class CalculaPi {

    /**
     * Número cujo valor é 2.
     */
    public static final int NUM_DOIS = 2;
    /**
     * Número cujo valor é 4.
     */
    public static final int NUM_QUATRO = 4;

    /**
     * Construtor da classe CalculaPi que impede que a mesma seja instanciada ou
     * acessada.
     */
    private CalculaPi() {
    }

    /**
     * Realiza Calculo de Pi.
     *
     * @param n O numero de entrada. Valor maior que 1.
     *
     * @return o número pi correspondente.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     */
    public static double calculaPi(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        double p = 0;

        while (i <= n) {
            d = d + NUM_DOIS;
            s = -1 * s;
            p = (double) (p + NUM_QUATRO * s / d);
            i++;
        }

        return p;
    }
}
