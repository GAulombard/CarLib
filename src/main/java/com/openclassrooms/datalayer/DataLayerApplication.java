package com.openclassrooms.datalayer;

import com.openclassrooms.datalayer.model.Product;
import com.openclassrooms.datalayer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataLayerApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {

        SpringApplication.run(DataLayerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Iterable<Product> products = productService.getProduct();
        products.forEach(product -> System.out.println(product.getName()+", comment: "+product.getComments()));


    }

}
