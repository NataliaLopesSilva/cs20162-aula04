/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Quadrado Perfeito.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class QuadradoPerfeito {

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR_DOIS = 2;

    /**
     * Construtor da classe QuadradoPerfeito que impede que a mesma seja
     * instanciada ou acessada.
     */
    private QuadradoPerfeito() {
    }

    /**
     * Verifica se o número de entrada é um quadrado perfeito.
     *
     * @param k O número de entrada. Valor maior ou igual a 1.
     *
     * @return true, se o número for um quadrado perfeito, ou false, se o número
     * não for um quadrado perfeito.
     *
     * @throws IllegalArgumentException Se k for inválido (menor que 1).
     */
    public static boolean quadradoPerfeito(final int k) {

        if (k < 1) {
            throw new IllegalArgumentException("valor de entrada inválido");
        }

        int i = 1;
        int q = 1;

        while (q < k) {
            i += CONTADOR_DOIS;
            q += i;
        }

        return (q == k);
    }
}
