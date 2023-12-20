package dev.piccodev.domain.pagination;

import java.util.List;

/* Esse será um pagination genérico, por isso o "T". */
public record Pagination<T>(int currentPage,
                            int perPage,
                            int total,
                            List<T> items) {
}
