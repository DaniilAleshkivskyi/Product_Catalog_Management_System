package com.productcatalog.product_catalog.controller;


import com.productcatalog.product_catalog.entity.Producer;
import com.productcatalog.product_catalog.entity.Product;
import com.productcatalog.product_catalog.service.ProducerService;
import com.productcatalog.product_catalog.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producers")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<Producer> getAllProducers() {
        return producerService.getAllProducers();
    }

    @PostMapping
    public Producer createProducer(@RequestBody Producer producer) {
        return producerService.createProducer(producer);
    }

    @PutMapping("/{id}")
    public Producer updateProducer(@PathVariable Long id, @RequestBody Producer producer) {
        return producerService.updateProducer(id, producer);
    }

    @DeleteMapping("/{id}")
    public void deleteProducer(@PathVariable Long id) {
        producerService.deleteProducer(id);
    }
}
