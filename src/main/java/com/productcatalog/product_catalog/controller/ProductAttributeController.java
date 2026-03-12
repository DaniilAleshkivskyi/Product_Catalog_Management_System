package com.productcatalog.product_catalog.controller;

import com.productcatalog.product_catalog.entity.ProductAttribute;
import com.productcatalog.product_catalog.service.ProductAttributeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-attributes")
public class ProductAttributeController {

    private final ProductAttributeService productAttributeService;

    public ProductAttributeController(ProductAttributeService productAttributeService) {
        this.productAttributeService = productAttributeService;
    }

    @GetMapping
    public List<ProductAttribute> getAllProductAttributes() {
        return productAttributeService.getAllProductAttributes();
    }

    @PostMapping
    public ProductAttribute createProductAttribute(@RequestBody ProductAttribute productAttribute) {
        return productAttributeService.createProductAttribute(productAttribute);
    }

    @PutMapping("/{id}")
    public ProductAttribute updateProductAttribute(@PathVariable Long id, @RequestBody ProductAttribute productAttribute) {
        return productAttributeService.updateProductAttribute(id, productAttribute);
    }

    @DeleteMapping("/{id}")
    public void deleteProductAttribute(@PathVariable Long id) {
        productAttributeService.deleteProductAttribute(id);
    }
}
