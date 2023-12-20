package dev.piccodev.domain.category;

import dev.piccodev.domain.AgregateRoot;

import java.time.Instant;
import java.util.UUID;

public class Category extends AgregateRoot<CategoryID> {

    private String name;
    private String description;

    private boolean isActive;

    //A semântica do "Instant" é um marco no tempo. Ele é
    //extremamente preciso e recomendado para ser usado em
    //logs e auditorias. O "Instant" é sempre "UTC", ele
    //não possui um timezone.
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    /* O construtor será privado e não será exposto para fora da classe. */
    private Category(final CategoryID id,
                    final String name,
                    final String description,
                    final boolean active,
                    final Instant createdAt,
                    final Instant updatedAt,
                    final Instant deletedAt) {

        super(id);
        this.name = name;
        this.description = description;
        this.isActive = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Category newCategory(final String name,
                                       final String description,
                                       final boolean isActive) {

        final var id = CategoryID.from(UUID.randomUUID());
        final var now = Instant.now();

        return new Category(id, name, description, isActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}