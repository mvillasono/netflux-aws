package com.mvillasono.movie_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvillasono.movie_service.domain.Genre;
import com.mvillasono.movie_service.dto.MovieDto;
import com.mvillasono.movie_service.service.MovieService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }

    @GetMapping("{genre}")
    public List<MovieDto> getAllByGenre(@PathVariable Genre genre) {
        return this.movieService.getAll(genre);
    }

}
