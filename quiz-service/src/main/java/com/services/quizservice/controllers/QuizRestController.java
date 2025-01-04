package com.services.quizservice.controllers;


import com.services.quizservice.entities.Quiz;
import com.services.quizservice.services.IServiceQuiz;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/e-learning/quizzes")
public class QuizRestController {

    private final IServiceQuiz servicequiz;



    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        return ResponseEntity.ok(servicequiz.getAllQuizzes());
    }

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestParam String title, @RequestParam Long categoryId) {
        return ResponseEntity.ok(servicequiz.createQuiz(title, categoryId));
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Quiz>> getQuizzesByCategory(@PathVariable Long id) {
        return ResponseEntity.ok(servicequiz.getQuizzesByCategory(id));
    }
}