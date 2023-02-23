package com.movie.app.ReactiveMovieRepertoire.infrastructure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("omdbapi")
public class MovieConfiguration {
    private String key;
    private String host;
}
