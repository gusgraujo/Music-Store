package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.BaseEntity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cart")
public class Cart extends BaseEntity {

    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "cart_products",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id")
    )
    private Set<Products> products = new HashSet<>();

    public void setPrice(Double totalPrice){
        this.totalPrice = totalPrice;
    }

    public Double getTotalPrice(){
        return this.totalPrice;
    }
}
