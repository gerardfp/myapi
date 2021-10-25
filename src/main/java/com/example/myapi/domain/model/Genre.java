package com.example.myapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    public UUID genreid;

    public String label;
}
