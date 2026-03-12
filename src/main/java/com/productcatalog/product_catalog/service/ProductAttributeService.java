package com.productcatalog.product_catalog.service;

import com.productcatalog.product_catalog.entity.ProductAttribute;
import com.productcatalog.product_catalog.repository.ProductAttributeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttributeService {
    private final ProductAttributeRepository productAttributeRepository;

    public ProductAttributeService(ProductAttributeRepository productAttributeRepository) {
        this.productAttributeRepository = productAttributeRepository;
    }

    public List<ProductAttribute> getAllProductAttributes() {
        return productAttributeRepository.findAll();
    }

    public ProductAttribute createProductAttribute(ProductAttribute productAttribute) {
        return productAttributeRepository.save(productAttribute);
    }

    public ProductAttribute updateProductAttribute(Long id, ProductAttribute productAttribute) {
        ProductAttribute existing = productAttributeRepository.findById(id).orElseThrow(() -> new RuntimeException("ProductAttribute with id:" + id+ " was not found"));
        existing.setName(productAttribute.getName());
        existing.setAttributeValue(productAttribute.getAttributeValue());
        return productAttributeRepository.save(existing);
    }

    public void deleteProductAttribute(Long id) {
        productAttributeRepository.deleteById(id);
    }
}
