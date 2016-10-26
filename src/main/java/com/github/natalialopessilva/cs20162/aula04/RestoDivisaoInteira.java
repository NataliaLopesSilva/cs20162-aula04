/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Resto da Divisao entre inteiros.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class RestoDivisaoInteira {

    /**
     * Construtor da classe RestoDivisaoInteira que impede que a mesma seja
     * instanciada ou acessada.
     */
    private RestoDivisaoInteira() {
    }

    /**
     * Verifica o Resto da Divisão entre 2 números inteiros.
     *
     * @param x O divisor. Valor maior ou igual a 0.
     * @param y O dividendo. Valor maior que 0.
     *
     * @return o resto da divisão entre dois números
     *
     * @throws IllegalArgumentException Se x for inválido (menor ou igual a 0).
     * @throws IllegalArgumentException Se y for inválido (menor que 0).
     */
    public static int restoDivisaoInteira(final int x, final int y) {
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Os numeros de entrada devem ser"
                    + " maiores que 0");
        }

        int s = x;

        while (y <= s) {
            s -= y;
        }

        return s;
    }
}
