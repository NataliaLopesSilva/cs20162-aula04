/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Somatório Elementar.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class SomatorioElementar {

    /**
     * Construtor da classe.
     */
    protected SomatorioElementar() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setSomatorioElementar() {
        SomatorioElementar somatorioElementar = new SomatorioElementar();
    }

    /**
     * Verifica o logaritmo natural de um número.
     *
     * @param n O número de termos. Valor maior que 1.
     *
     * @return o logaritmo de n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     * @throws IllegalArgumentException Se k for inválido (menor que 2).
     */
    public static int somatorioElementar(final int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 1, s = 0, d = 0;

        do {
            d = 1 + (i * i);
            s += 1 / d;
            i++;
        } while (i <= n);

        return s;
    }
}
