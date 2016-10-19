/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação da Regra de Horner para avaliação de um Polinômio.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class RegraHorner {

    /**
     * Construtor da classe.
     */
    protected RegraHorner() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setRegraHorner() {
        RegraHorner regraHorner = new RegraHorner();
    }

    /**
     * Verifica o calculo de um Polinômio.
     *
     * @param x É a base.
     * @param g O grau do polinônmio.
     * @param a Os coeficientes.
     *
     * @return o resultado do polinômio.
     *
     * @throws IllegalArgumentException Se g for inválido (menor que 1).
     */
    public static int regraHornerPolinomio(final int x, final int g,
            final int[] a) {

        if (g < 1) {
            throw new IllegalArgumentException("Valor de n deve ser maior "
                    + "que um");
        }

        int p = a[g], i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i--;
        }

        return p;
    }
}
