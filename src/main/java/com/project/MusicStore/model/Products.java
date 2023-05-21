package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.NamedBaseEntity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class Products extends NamedBaseEntity {

    private String description;
    private Double price;
    private String type;

    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "payment_id")
    Payments payment;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_genre",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genres> genres = new HashSet<>();



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
