import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {


    //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5+5);
    }
}
