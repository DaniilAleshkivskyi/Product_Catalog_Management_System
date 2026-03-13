package com.productcatalog.product_catalog.service;

import com.productcatalog.product_catalog.entity.Product;
import com.productcatalog.product_catalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Product existing = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product with id:" + id+ " was not found"));
        existing.setProducer(product.getProducer());
        return productRepository.save(existing);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByProducerId(Long producerId) {
        return productRepository.findByProducerId(producerId);
    }
}
