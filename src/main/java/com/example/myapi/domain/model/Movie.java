package com.example.myapi.domain.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    public UUID movieid;

    public String title;
    public String imageurl;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movieid"),
            inverseJoinColumns = @JoinColumn(name = "actorid")
    )
    public Set<Actor> actors = new HashSet<>();
}
