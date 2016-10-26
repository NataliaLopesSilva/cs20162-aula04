package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class SomatorioElementarTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueZeroInvalido() {
        SomatorioElementar.somatorioElementar(0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(0, SomatorioElementar.somatorioElementar(4));
    }
}
