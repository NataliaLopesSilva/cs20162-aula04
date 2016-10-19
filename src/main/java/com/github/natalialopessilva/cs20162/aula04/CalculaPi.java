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
public class CalculaPi {

    /**
     * Construtor da classe.
     */
    protected CalculaPi() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setCalculaPi() {
        CalculaPi calculaPi = new CalculaPi();
    }

    /**
     * Número cujo valor é 2.
     */
    public static final int NUM_DOIS = 2;
    /**
     * Número cujo valor é 4.
     */
    public static final int NUM_QUATRO = 4;

    /**
     * Realiza Calculo de Pi.
     *
     * @param n O numero de entrada. Valor maior que 1.
     *
     * @return o número pi correspondente.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     */
    public static int calculaPi(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 1, s = -1, d = -1, p = 0;

        do {
            d = d + NUM_DOIS;
            s = -1 * s;
            p = (p + NUM_QUATRO * s) / d;
            i++;
        } while (i <= n);

        return p;
    }
}
