package com.github.natalialopessilva.cs20162.aula04;

/**
 * Implementação do Algoritmo de Logaritimo Natural
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 3, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class LogaritmoNatural {

    /**
     * Construtor da classe.
     */
    protected LogaritmoNatural() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setLogaritmoNatural() {
        LogaritmoNatural logaritmoNatural = new LogaritmoNatural();
    }

    /**
     * Valor o qual o ontador inicia.
     */
    public static final int CONTADOR = 2;

    /**
     * Verifica o logaritmo natural de um número.
     *
     * @param n O número de termos. Valor maior que 1.
     * @param k O número de precisão. Valor maior que 2.
     *
     * @return o logaritmo de n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     * @throws IllegalArgumentException Se k for inválido (menor que 2).
     */
    public static int logaritimo(final int n, final int k) {
        if (n < 1 || k < CONTADOR) {
            throw new IllegalArgumentException("O valor de n deve ser maior que"
                    + " um e o valor de k deve ser maior que dois");
        }
        int i = CONTADOR, e = n + 1;

        while (i <= k) {
            int p = (int) Math.pow(n, i);
            int f = Fatorial.calculaFatorial(i);

            e = (e + p) / f;

            i++;
        }

        return e;
    }
}
