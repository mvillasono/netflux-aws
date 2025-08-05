package com.mvillasono.movie_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvillasono.movie_service.domain.Genre;
import com.mvillasono.movie_service.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByGenre(Genre genre);
}
