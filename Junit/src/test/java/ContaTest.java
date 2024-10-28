import org.example.Pessoa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
public class ContaTest {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamentos = {10, 20, 30, 40, 50};
        int[] segundoLancamentos = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamentos, segundoLancamentos);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("brenno", LocalDate.of(2002, 12, 9));

        assertNotNull(pessoa1);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
