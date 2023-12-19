package infrastructure;

/* Aqui teremos o ponto de entrada da aplicação Spring. */

import dev.piccodev.domain.infrastructure.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMain(){

        Assertions.assertNotNull(new Main());

        Main.main(new String[]{}); // Executa o método main da classe Main.
    }
}