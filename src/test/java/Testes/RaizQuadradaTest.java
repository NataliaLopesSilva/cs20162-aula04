package Testes;


import com.github.natalialopessilva.cs20162.aula04.RaizQuadrada;
import static com.github.natalialopessilva.cs20162.aula04.RaizQuadrada.setRaizQuadrada;
import org.junit.Assert;
import org.junit.Test;

public class RaizQuadradaTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueZeroInvalido() {
        RaizQuadrada.raizQuadrada(-1, 0);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(1.41d, RaizQuadrada.raizQuadrada(2, 3), 0.01d);
    }

    @Test
    public void cemPorCentoCobertura() {
        setRaizQuadrada();
    }
}
