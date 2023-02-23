package com.movie.app.ReactiveMovieRepertoire.api;

import com.movie.app.ReactiveMovieRepertoire.api.dto.MovieDetailsDTO;
import com.movie.app.ReactiveMovieRepertoire.domain.MovieQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieQuery movieQuery;

    @GetMapping("")
    Mono<MovieDetailsDTO> findMovieDetails(@RequestParam("title") String movieTitle) {
        return movieQuery.findMovieDetails(movieTitle);
    }
}
