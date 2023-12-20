package dev.piccodev.domain.validation;

/* Essa será a classe pai de todos os validadores. Todos eles herdarão dessa classe. */
public abstract class Validator {

    private final ValidationHandler handler;

    public abstract void validate();

    protected Validator(final ValidationHandler handler) {
        this.handler = handler;
    }

    protected ValidationHandler validationHandler(){

        return this.handler;
    }
}