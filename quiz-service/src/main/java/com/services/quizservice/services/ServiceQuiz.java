package com.services.quizservice.services;

import com.services.quizservice.entities.Category;
import com.services.quizservice.entities.Quiz;
import com.services.quizservice.repositories.CategoryRepository;
import com.services.quizservice.repositories.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceQuiz implements IServiceQuiz {

    private final QuizRepository quizRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz createQuiz(String title, Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setCategory(category);

        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getQuizzesByCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));

        return category.getQuizzes();
    }
}