package com.productcatalog.product_catalog.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setProducer(Producer producer) {
        this.producer = producer;
    }
    public Producer getProducer() {
        return producer;
    }
}
