package dev.piccodev.domain.category;

import dev.piccodev.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class CategoryID extends Identifier {

    private final String value;


    private CategoryID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    /* Esse método será usado para sempre criarmos um ID novo. */
    public static CategoryID unique(){

        return CategoryID.from(UUID.randomUUID());
    }

    /* Abaixo temos dois métodos helpers. */

    public static CategoryID from(final String id){

        return new CategoryID(id);
    }

    public static CategoryID from(final UUID id){

        return new CategoryID(id.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
