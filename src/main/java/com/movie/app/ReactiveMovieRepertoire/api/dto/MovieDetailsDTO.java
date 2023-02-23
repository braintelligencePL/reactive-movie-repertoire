package com.movie.app.ReactiveMovieRepertoire.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsDTO {
    @JsonProperty("Title")
    String title;
}
