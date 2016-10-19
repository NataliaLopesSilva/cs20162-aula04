package Testes;

import com.github.natalialopessilva.cs20162.aula04.CalculaPi;
import static com.github.natalialopessilva.cs20162.aula04.CalculaPi.setCalculaPi;
import org.junit.Assert;
import org.junit.Test;

public class CalculaPiTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        CalculaPi.calculaPi(0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(0, CalculaPi.calculaPi(5));
    }

    @Test
    public void cemPorCentoCobertura() {
        setCalculaPi();
    }
}
