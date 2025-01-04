package com.services.questionservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String questionText;

    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    ////Commented because it generates a bug when trying to make a ManyToOne relationship whith another module
    /// the quiz-service module
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "quiz_id", nullable = false)
//    @JsonIgnore
//    private Quiz quiz;
}