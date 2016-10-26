package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class RegraHornerTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorUmInvalido() {
        int[] a = {4, 3, 2, 1};
        RegraHorner.regraHornerPolinomio(1, 0, a);
    }

    @Test
    public void resultadoEsperado() {
        int[] a = {4, 3, 2, 1};
        Assert.assertEquals(10, RegraHorner.regraHornerPolinomio(1, 3, a));
    }
}
