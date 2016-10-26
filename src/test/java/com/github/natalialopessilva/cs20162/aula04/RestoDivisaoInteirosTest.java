package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class RestoDivisaoInteirosTest {

    @Test(expected = IllegalArgumentException.class)
    public void xMenorQueZeroInvalido() {
        RestoDivisaoInteira.restoDivisaoInteira(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void yMenorIgualQueZeroInvalido() {
        RestoDivisaoInteira.restoDivisaoInteira(3, 0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(3, RestoDivisaoInteira.restoDivisaoInteira(3, 8));
    }

    @Test
    public void resultadoEsperado2() {
        Assert.assertEquals(2, RestoDivisaoInteira.restoDivisaoInteira(5, 3));
    }
}
