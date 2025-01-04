package com.services.quizservice.services;

import com.services.quizservice.entities.Category;

import java.util.List;

public interface IServiceCategory {
    List<Category> getAllCategories();
    Category createCategory(String name);
    Category getCategoryById(Long id);
}
