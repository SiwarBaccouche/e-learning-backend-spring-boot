package com.services.questionservice.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class MultipleChoiceQuestion extends Question {

    @ElementCollection
    private List<String> options;

    private String correctAnswer;


    ///////////         This script is commented since its bugging   //////////////////////////
    //////////// when trying to attempt to create a oneToMany relationhsip ////////////////////
    // /////////  with the options of the question  when it comes to multiple choices questions ////
//    private String correctAnswer;
//    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<MultipleChoiceOption> options = new ArrayList<>();
}