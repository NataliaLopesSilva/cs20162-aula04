package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class RazaoAureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void xMenorQueZeroInvalido() {
        RazaoAurea.calculaRazaoAurea(-1, 3, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void kMenorQueZeroInvalido() {
        RazaoAurea.calculaRazaoAurea(3, 3, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xMaiorQueYInvalido() {
        RazaoAurea.calculaRazaoAurea(2, 1, 5);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(1, RazaoAurea.calculaRazaoAurea(1, 2, 4));
    }
}
