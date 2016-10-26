package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class QuadradoPerfeitoTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        QuadradoPerfeito.quadradoPerfeito(0);
    }

    @Test
    public void resultadoEsperadoIncorreto() {
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(5));
    }

    @Test
    public void resultadoEsperadoCorreto() {
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(4));
    }
}
