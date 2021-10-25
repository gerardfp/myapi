package com.example.myapi.domain.dto;

import com.example.myapi.domain.model.Genre;

import java.util.List;
import java.util.UUID;

public class MovieDetails {
    public UUID movieid;
    public String title;
    public List<ActorInMovie> actors;
    List<Genre> genres;
}
