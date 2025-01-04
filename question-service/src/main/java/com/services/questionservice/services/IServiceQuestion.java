package com.services.questionservice.services;

import com.services.questionservice.entities.Question;

import java.util.List;

public interface IServiceQuestion {
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    Question saveQuestion(Question question);
    void deleteQuestion(Long id);
}