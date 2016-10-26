/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

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
public final class Fatorial {

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR = 2;

    /**
     * Construtor da classe Fatorial que impede que a mesma seja instanciada ou
     * acessada.
     */
    private Fatorial() {
    }

    /**
     * Verifica o fatorial de um número.
     *
     * @param n O número de entrada, para calculo de seu fatorial. Valor maior
     * 1.
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

        int i = CONTADOR;
        int f = 1;

        do {
            f = f * i;
            i = i + 1;

        } while (i <= n);

        return f;
    }
}
