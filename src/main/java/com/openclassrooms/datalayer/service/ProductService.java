package com.openclassrooms.datalayer.service;

import com.openclassrooms.datalayer.model.Product;
import com.openclassrooms.datalayer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProduct() {
        return productRepository.findAll();
    }
}
