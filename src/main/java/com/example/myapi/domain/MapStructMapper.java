package com.example.myapi.domain;

import com.example.myapi.domain.dto.ActorDetails;
import com.example.myapi.domain.dto.ActorInMovie;
import com.example.myapi.domain.dto.MovieDetails;
import com.example.myapi.domain.dto.MovieInActor;
import com.example.myapi.domain.model.Actor;
import com.example.myapi.domain.model.Movie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    ActorDetails actorToActorDetails(Actor actor);
    MovieDetails movieToMovieDetails(Movie movie);
    ActorInMovie actorToActorInMovie(Actor actor);
    MovieInActor movieToMovieInActor(Movie movie);
    List<MovieDetails> moviesToMoviesDetails(List<Movie> movies);
    List<ActorDetails> actorsToActorsDetails(List<Actor> actors);
}
