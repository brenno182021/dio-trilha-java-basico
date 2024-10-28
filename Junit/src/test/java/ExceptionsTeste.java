import org.example.Conta;
import org.example.TransfrenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransfrenciaEntreContas transfrenciaEntreContas = new TransfrenciaEntreContas();


        //espera que seja lancada exceção
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transfrenciaEntreContas.transfere(contaOrigem, contaDestino, -1)
                );

        //espera que nao seja lancada exeção
        Assertions.assertDoesNotThrow(() ->
                transfrenciaEntreContas.transfere(contaOrigem, contaDestino, 20)
                );
    }
}
