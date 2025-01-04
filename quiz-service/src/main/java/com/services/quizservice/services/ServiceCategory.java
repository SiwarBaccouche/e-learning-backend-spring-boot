package com.services.quizservice.services;

import com.services.quizservice.entities.Category;
import com.services.quizservice.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceCategory  implements IServiceCategory {

    private final CategoryRepository categoryRepository;



    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(String title) {
        Category category = new Category();
        category.setTitle(title);
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
    }
}