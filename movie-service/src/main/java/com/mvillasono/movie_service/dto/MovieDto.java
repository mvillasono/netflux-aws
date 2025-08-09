package com.mvillasono.movie_service.dto;

import com.mvillasono.movie_service.domain.Genre;

public record MovieDto(Integer id, String title, Integer releaseYear, Genre genre) {

}
