package dev.piccodev.domain;

import dev.piccodev.domain.validation.ValidationHandler;

public abstract class AgregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AgregateRoot(final ID id){
        super(id);
    }
}
