import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParateste() {
        BancoDeDados.insereDados(new Pessoa("joao", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDadosDoteste() {
        BancoDeDados.removeDados(new Pessoa("joao", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}
