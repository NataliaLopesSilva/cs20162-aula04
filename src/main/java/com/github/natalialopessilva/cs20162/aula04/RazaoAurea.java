/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Razão Aurea.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class RazaoAurea {

    /**
     * Construtor da classe RazaoAurea que impede que a mesma seja instanciada
     * ou acessada.
     */
    private RazaoAurea() {
    }

    /**
     * Verifica a razão aurea entre dois números.
     *
     * @param x O primeiro numero de entrada. Valor menor que y.
     * @param y O segundo de entrada. Valor maior que x.
     * @param k O número de vezes da razão.
     *
     * @return a razão aurea
     *
     * @throws IllegalArgumentException Se x for inválido (menor que 0).
     * @throws IllegalArgumentException Se y for inválido (menor que x).
     * @throws IllegalArgumentException Se k for inválido (menor que 0).
     */
    public static int calculaRazaoAurea(final int x, final int y, final int k) {
        if (x < 0 || x > y || k < 0) {
            throw new IllegalArgumentException("x e k devem ser maior que 0, e"
                    + " x deve ser menor que y");
        }

        int i = 1;
        int t = 0;
        int a = y;
        int b = x;

        while (i <= k) {
            t = a;
            a = a + b;
            b = t;

            i++;
        }

        return (a / b);
    }
}
