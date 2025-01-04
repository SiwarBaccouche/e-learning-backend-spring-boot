package com.services.questionservice.entities;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class MultipleChoiceQuestion extends Question {

    @ElementCollection
    private List<String> options;

    private String correctAnswer;
}