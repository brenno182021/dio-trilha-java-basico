import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("brenno", LocalDate.of(2002, 12, 9));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void validarMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("brenno", LocalDate.of(2002, 12, 9));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa1 = new Pessoa("brenno1", LocalDate.now());
        Assertions.assertFalse(pessoa1.ehMaiorDeIdade());


    }
}
