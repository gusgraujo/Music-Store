package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.BaseEntity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Orders")
public class Orders extends BaseEntity {

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "order")
    private Payments payments;

    @ManyToMany
    @JoinTable(
            name = "orders_product",
            joinColumns = @JoinColumn(name = "orders_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id")
    )
    private Set<Products> products = new HashSet<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
