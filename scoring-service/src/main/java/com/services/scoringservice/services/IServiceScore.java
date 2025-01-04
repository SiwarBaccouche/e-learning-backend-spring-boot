package com.services.scoringservice.services;

import com.services.quizservice.entities.Quiz;

public interface IServiceScore {
    Object addPoints(Long userId, Quiz quiz, int points);
}
