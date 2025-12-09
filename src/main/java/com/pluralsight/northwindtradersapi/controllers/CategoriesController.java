package com.pluralsight.northwindtradersapi.controllers;

import com.pluralsight.northwindtradersapi.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    private List<Category> categories = new ArrayList<>();

    public CategoriesController() {
        categories.add(new Category(1, "Beverages"));
        categories.add(new Category(2, "Condiments"));
        categories.add(new Category(3, "Produce"));
    }

    // GET /categories
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categories;
    }

    // GET /categories/{id}
    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        for (Category c : categories) {
            if (c.getCategoryId() == id) {
                return c;
            }
        }
        return null;
    }
}