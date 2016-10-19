package Testes;


import com.github.natalialopessilva.cs20162.aula04.QuadradoPerfeito;
import static com.github.natalialopessilva.cs20162.aula04.QuadradoPerfeito.setQuadradoPerfeito;
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

    @Test
    public void cemPorCentoCobertura() {
        setQuadradoPerfeito();
    }
}
