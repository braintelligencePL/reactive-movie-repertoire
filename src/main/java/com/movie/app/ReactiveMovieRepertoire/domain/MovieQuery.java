package com.movie.app.ReactiveMovieRepertoire.domain;

import com.movie.app.ReactiveMovieRepertoire.api.dto.MovieDetailsDTO;
import reactor.core.publisher.Mono;

public interface MovieQuery {

    Mono<MovieDetailsDTO> findMovieDetails(String movieTitle);
}
