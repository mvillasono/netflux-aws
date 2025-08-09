package com.mvillasono.movie_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvillasono.movie_service.domain.Genre;
import com.mvillasono.movie_service.dto.MovieDto;
import com.mvillasono.movie_service.mapper.EntityDtoMapper;
import com.mvillasono.movie_service.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll() {
        return movieRepository.findAll()
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

    public List<MovieDto> getAll(Genre genre) {
        return movieRepository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

}
