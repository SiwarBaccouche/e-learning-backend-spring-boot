package com.services.scoringservice.services;

import com.services.quizservice.entities.Quiz;
import com.services.scoringservice.entities.Score;
import com.services.scoringservice.repositories.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class ServiceScore implements IServiceScore {

    private final ScoreRepository scoreRepository;

    @Override
    public Score addPoints(Long userId, Quiz quiz, int points) {
        Score score = new Score();
        score.setUserId(userId);
        score.setQuiz(quiz);
        score.setPoints(points);
        return scoreRepository.save(score);
    }
}