package com.services.questionservice.controllers;

import com.services.questionservice.entities.MultipleChoiceQuestion;
import com.services.questionservice.entities.Question;
import com.services.questionservice.entities.ShortAnswerQuestion;
import com.services.questionservice.entities.TrueFalseQuestion;
import com.services.questionservice.services.IServiceQuestion;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/e-learning/questions")
public class QuestionRestController {

    private final IServiceQuestion questionService;

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        return ResponseEntity.ok(questionService.getQuestionById(id));
    }

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }
    @PostMapping("/addMultipleChoiceQuestion")
    public ResponseEntity<Question> createQuestion(@RequestBody MultipleChoiceQuestion question) {
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }
    @PostMapping("/addTrueFalseQuestion")
    public ResponseEntity<Question> createQuestion(@RequestBody TrueFalseQuestion question) {
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }

    @PostMapping("/addShortAnswerQuestions")
    public ResponseEntity<Question> createQuestion(@RequestBody ShortAnswerQuestion question) {
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }



    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@PathVariable Long id, @RequestBody Question question) {
        Question existingQuestion = questionService.getQuestionById(id);
        question.setId(existingQuestion.getId());
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }
}