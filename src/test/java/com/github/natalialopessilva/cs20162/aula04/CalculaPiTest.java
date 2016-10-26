package com.github.natalialopessilva.cs20162.aula04;

import com.github.natalialopessilva.cs20162.aula04.CalculaPi;
import org.junit.Assert;
import org.junit.Test;

public class CalculaPiTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        CalculaPi.calculaPi(0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(3.0d, CalculaPi.calculaPi(3), 0.01d);
    }
}
