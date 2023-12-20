package dev.piccodev.domain.exceptions;

/* Essa será uma exception base sem stacktrace para não prejudicar a performance da
* aplicação. Lançaremos exceptions que falarão o que exatamente ocorreu, então não precisaremos
* desse nível de granularidade das exceptions. */
public class NoStacktraceException extends RuntimeException {

    public NoStacktraceException(final String message) {
        this(message, null);
    }

    public NoStacktraceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
