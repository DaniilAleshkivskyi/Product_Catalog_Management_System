package com.productcatalog.product_catalog.repository;

import com.productcatalog.product_catalog.entity.ProductAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Long> { }
