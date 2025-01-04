package com.services.quizservice.controllers;

import com.services.quizservice.entities.Category;
import com.services.quizservice.services.IServiceCategory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/e-learning/categories")
public class CategoryRestController {

    private final IServiceCategory serviceCategory;



    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(serviceCategory.getAllCategories());
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestParam String name) {
        return ResponseEntity.ok(serviceCategory.createCategory(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceCategory.getCategoryById(id));
    }
}