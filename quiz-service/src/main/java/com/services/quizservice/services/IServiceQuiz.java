package com.services.quizservice.services;

import com.services.quizservice.entities.Quiz;

import java.util.List;

public interface IServiceQuiz {
    List<Quiz> getAllQuizzes();
    Quiz createQuiz(String title, Long categoryId);
    List<Quiz> getQuizzesByCategory(Long categoryId);
}
