package dev.piccodev.domain.validation.handler;

import dev.piccodev.domain.exceptions.DomainException;
import dev.piccodev.domain.validation.Error;
import dev.piccodev.domain.validation.ValidationHandler;

import java.util.List;

/* Esse handler lançará uma exception sempre que ele receber um erro. */

/* Ele não será acumulativo. */
public class ThrowsValidationHandler implements ValidationHandler {

    @Override
    public ValidationHandler append(Error error) {
        throw DomainException.with(error);
    }

    @Override
    public ValidationHandler append(ValidationHandler validationHandler) {

        throw DomainException.with(validationHandler.getErrors());

    }

    @Override
    public ValidationHandler validate(Validation validation) {
        try {
            validation.validate();
            return this;
        } catch (DomainException e) {
            throw DomainException.with(List.of(new Error(e.getMessage())));
        }
    }

    @Override
    public List<Error> getErrors() {
        return null;
    }
}
