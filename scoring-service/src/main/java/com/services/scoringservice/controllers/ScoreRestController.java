package com.services.scoringservice.controllers;

import com.services.quizservice.entities.Quiz;
import com.services.scoringservice.services.IServiceScore;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/score")
@AllArgsConstructor
public class ScoreRestController {

    private final IServiceScore iServiceScore;

    @PostMapping("/{userId}/quiz/{quizId}")
    public ResponseEntity<Object> addPoints(
            @PathVariable Long userId,
            @PathVariable Long quizId,
            @RequestParam int points) {
        Quiz quiz = new Quiz();
        quiz.setId(quizId);
        return ResponseEntity.ok(iServiceScore.addPoints(userId, quiz, points));
    }
}
