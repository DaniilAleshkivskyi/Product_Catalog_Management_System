package com.productcatalog.product_catalog.repository;

import com.productcatalog.product_catalog.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Long> {}