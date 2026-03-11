package com.productcatalog.product_catalog.service;

import com.productcatalog.product_catalog.entity.Producer;
import com.productcatalog.product_catalog.entity.Product;
import com.productcatalog.product_catalog.repository.ProducerRepository;
import com.productcatalog.product_catalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    private final ProducerRepository producerRepository;

    public ProducerService(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    public List<Producer> getAllProducer() {
        return producerRepository.findAll();
    }

    public Producer createProducer(Producer producer) {
        return producerRepository.save(producer);
    }

    public Producer updateProducer(Long id, Producer producer) {
        Producer existing = producerRepository.findById(id).orElseThrow(() -> new RuntimeException("Producer with id:" + id+ " was not found"));
        existing.setName(producer.getName());
        existing.setDescription(producer.getDescription());
        return producerRepository.save(existing);
    }

    public void deleteProducer(Long id) {
        producerRepository.deleteById(id);
    }
}
