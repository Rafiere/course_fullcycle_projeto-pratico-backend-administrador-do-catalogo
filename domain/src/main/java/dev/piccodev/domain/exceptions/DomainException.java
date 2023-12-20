package dev.piccodev.domain.exceptions;

import dev.piccodev.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktraceException {

    private final List<Error> errors;

    private DomainException(final String message, final List<Error> errors){

        /* Os últimos parâmetros ajudarão na performance da aplicação pois eles não
        * exibirão a stacktrace completa. */
        super(message);
        this.errors = errors;
    }

    public static DomainException with(final Error error){

        return new DomainException(error.message(), List.of(error));
    }

    public static DomainException with(final List<Error> errors){

        return new DomainException("", errors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
