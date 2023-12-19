package application;

import dev.piccodev.domain.application.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUseCase(){

        UseCase useCase = new UseCase();

        Assertions.assertNotNull(useCase);
    }
}