package com.productcatalog.product_catalog.repository;

import com.productcatalog.product_catalog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProducerId(Long producerId);
}