package dev.piccodev.domain.validation;

import java.util.List;

/* Esse handler dirá como cada exception de validação deverá lançar as
* próprias exceptions. */

public interface ValidationHandler {

    /* Uma interface fluente é um método retornar a própria instância e encadearmos as
    * chamadas de métodos. */

    ValidationHandler append(Error error);

    /* Poderemos receber os erros de um handler e o incrementarmos. */
    ValidationHandler append(ValidationHandler validationHandler);

    /* Será uma interface que fará a validação da entidade. */
    ValidationHandler validate(Validation validation);

    List<Error> getErrors();

    default boolean hasError(){

        return getErrors() != null && !getErrors().isEmpty();
    }

    interface Validation {

        void validate();
    }
}
