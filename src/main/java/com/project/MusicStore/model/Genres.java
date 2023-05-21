package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.NamedBaseEntity;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class Genres extends NamedBaseEntity{

    @ManyToMany(mappedBy = "genres")
    private Set<Products> products = new HashSet<>();
}
