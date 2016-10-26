package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class LogaritmoNaturalTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        LogaritmoNatural.logaritimo(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueDoisInvalido() {
        LogaritmoNatural.logaritimo(2, 1);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(1, LogaritmoNatural.logaritimo(1, 2));
    }
}
