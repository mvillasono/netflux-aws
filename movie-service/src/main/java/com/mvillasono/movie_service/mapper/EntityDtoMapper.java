package com.mvillasono.movie_service.mapper;

import com.mvillasono.movie_service.dto.MovieDto;
import com.mvillasono.movie_service.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre());
    }
}
