package com.project.MusicStore.model;

import com.project.MusicStore.model.Base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class Payments extends BaseEntity {

    private Double amount;
    private String method;
    private Date date;

    @OneToOne
    @JoinColumn(name = "order_id")
    Order order;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
