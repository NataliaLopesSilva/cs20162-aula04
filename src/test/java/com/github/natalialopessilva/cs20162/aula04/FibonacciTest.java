package com.github.natalialopessilva.cs20162.aula04;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueZeroInvalido() {
        Fibonacci.fibonacci(-1);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void resultadoEsperado2() {
        Assert.assertEquals(13, Fibonacci.fibonacci(7));
    }
}
