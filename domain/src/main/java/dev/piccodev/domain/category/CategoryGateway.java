package dev.piccodev.domain.category;

import dev.piccodev.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category category);

    void deleteById(CategoryID id);

    Optional<Category> findById(CategoryID id);

    Category update(Category category);

    /* Esses objetos serão para a paginação das categorias existentes. */
    Pagination<Category> findAll(CategorySearchQuery query);
}
