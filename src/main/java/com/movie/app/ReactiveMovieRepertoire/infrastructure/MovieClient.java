package com.movie.app.ReactiveMovieRepertoire.infrastructure;

import com.movie.app.ReactiveMovieRepertoire.api.dto.MovieDetailsDTO;
import com.movie.app.ReactiveMovieRepertoire.domain.MovieQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class MovieClient implements MovieQuery {

    private final MovieConfiguration movieConfiguration;

    @Override
    public Mono<MovieDetailsDTO> findMovieDetails(final String movieTitle) {
        WebClient client = WebClient.builder()
                .baseUrl(movieConfiguration.getHost())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        return client.get().uri("?t={movieTitle}&apiKey={apiKey}", movieTitle, movieConfiguration.getKey())
                .retrieve()
                .bodyToMono(MovieDetailsDTO.class);
    }
}
