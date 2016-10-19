package Testes;


import com.github.natalialopessilva.cs20162.aula04.SomatorioElementar;
import static com.github.natalialopessilva.cs20162.aula04.SomatorioElementar.setSomatorioElementar;
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

    @Test
    public void cemPorCentoCobertura() {
        setSomatorioElementar();
    }
}
