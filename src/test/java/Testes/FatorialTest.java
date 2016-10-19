package Testes;


import com.github.natalialopessilva.cs20162.aula04.Fatorial;
import static com.github.natalialopessilva.cs20162.aula04.Fatorial.setFatorial;
import org.junit.Assert;
import org.junit.Test;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        Fatorial.calculaFatorial(0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(6, Fatorial.calculaFatorial(3));
    }

    @Test
    public void cemPorCentoCobertura() {
        setFatorial();
    }
}
