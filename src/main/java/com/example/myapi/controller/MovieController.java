package com.example.myapi.controller;

import com.example.myapi.domain.MapStructMapper;
import com.example.myapi.domain.dto.MovieDetails;
import com.example.myapi.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieRepository movieRepository;
    private final MapStructMapper mapStructMapper;

    public MovieController(MovieRepository movieRepository, MapStructMapper mapStructMapper) {
        this.movieRepository = movieRepository;
        this.mapStructMapper = mapStructMapper;
    }

//    @GetMapping("/")
//    public List<Movie> getAll() {
//        return movieService.findAll();
//    }

    @GetMapping("/")
    public List<MovieDetails> getAll() {
        return mapStructMapper.moviesToMoviesDetails(movieRepository.findAll());
    }

    @GetMapping("/{id}")
    public MovieDetails getById(@PathVariable UUID id) {
        return mapStructMapper.movieToMovieDetails(movieRepository.findById(id).orElse(null));
    }

    @GetMapping("/findByTitle")
    public List<MovieDetails> findByTitle(@RequestParam String title) {
        return mapStructMapper.moviesToMoviesDetails(movieRepository.findByTitle(title));
    }

    @GetMapping("/searchByTitle")
    public List<MovieDetails> searchByTitle(@RequestParam String title) {
        return mapStructMapper.moviesToMoviesDetails(movieRepository.searchByTitle(title));
    }
}
