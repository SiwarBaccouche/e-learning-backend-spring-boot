

///////////         This script is commented since its bugging   //////////////////////////
//////////// when trying to attempt to create a oneToMany relationhsip ////////////////////
// /////////  with the options of the question  when it comes to multiple choices questions ////

//package com.services.questionservice.entities;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "multiple_choice_option")
//public class MultipleChoiceOption {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String option;
//
//    @ManyToOne
//    @JoinColumn(name = "question_id", nullable = false)
//    private MultipleChoiceQuestion question;
//}