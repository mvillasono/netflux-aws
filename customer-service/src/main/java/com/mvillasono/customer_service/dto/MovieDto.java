package com.mvillasono.customer_service.dto;

import com.mvillasono.customer_service.domain.Genre;

public record MovieDto(Integer id, String title, Integer releaseYear, Genre genre) {

}
