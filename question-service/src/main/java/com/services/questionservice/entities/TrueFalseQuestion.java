package com.services.questionservice.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TrueFalseQuestion extends Question {

    private Boolean correctAnswer;
}