package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.NamedBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Genres")
public class Genres extends NamedBaseEntity{

    @ManyToMany(mappedBy = "genres")
    private Set<Products> products = new HashSet<>();
}
