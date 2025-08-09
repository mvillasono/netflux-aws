package com.mvillasono.customer_service.dto;

import com.mvillasono.customer_service.domain.Genre;

import java.util.List;

public record CustomerDto(Integer id,
        String name,
        Genre favoriteGenre,
        List<MovieDto> recommendedMovies) {
}
