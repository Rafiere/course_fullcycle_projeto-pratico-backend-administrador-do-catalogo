package dev.piccodev.domain;

import java.util.Objects;

/* Como uma entidade é definida pelo seu ID, uma entidade pode ser qualquer coisa, desde
* que seu ID herde do value object "Identifier". */
public abstract class Entity<ID extends Identifier> {

    protected final ID id;

    protected Entity(final ID id) {

        Objects.requireNonNull(id, "'id' should not be null");

        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //A referência do "this" é a mesma para o que está vindo.
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
