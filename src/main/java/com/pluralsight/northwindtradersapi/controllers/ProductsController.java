package com.pluralsight.northwindtradersapi.controllers;

import com.pluralsight.northwindtradersapi.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    private List<Product> products = new ArrayList<>();

    public ProductsController() {
        products.add(new Product(1, "Chai", 1, 18.00));
        products.add(new Product(2, "Chang", 1, 19.00));
        products.add(new Product(3, "Aniseed Syrup", 2, 10.00));
    }

    // GET /products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }

    // GET /products/{id}
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null; // simple temporary behavior
    }
}