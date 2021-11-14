package com.buyukli.ivan.services;

import com.buyukli.ivan.repositories.ProductRepository;
import com.buyukli.ivan.data.Product;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(productRepository.findAllProducts());
    }

}
