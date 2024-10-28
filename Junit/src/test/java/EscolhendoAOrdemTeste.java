import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.MethodName.class) segue a ordem pela nomenclatura do metodo
//@TestMethodOrder(MethodOrderer.Random.class) segue de forma aleatoria
//@TestMethodOrder(MethodOrderer.DisplayName.class) segue de forma pelo @DisplayName("") no metodo e segue de forma alfabetica
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
