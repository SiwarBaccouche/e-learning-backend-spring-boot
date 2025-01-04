package com.services.questionservice.entities;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShortAnswerQuestion extends Question {

    private String correctAnswer;
}