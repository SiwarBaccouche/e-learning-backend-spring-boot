//package com.services.questionservice.services;
//
//import com.services.questionservice.entities.MultipleChoiceOption;
//import com.services.questionservice.entities.MultipleChoiceQuestion;
//import com.services.questionservice.repositories.MultipleChoiceOptionRepository;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@AllArgsConstructor
//@Service
//public class MultipleChoiceOptionService implements IServiceOption {
//
//    private final MultipleChoiceOptionRepository optionRepository;
//
//    public MultipleChoiceOption addOption(Long questionId, String option) {
//        MultipleChoiceOption newOption = new MultipleChoiceOption();
//        MultipleChoiceQuestion question = new MultipleChoiceQuestion();
//        question.setId(questionId);
//        newOption.setQuestion(question);
//        newOption.setOption(option);
//        return optionRepository.save(newOption);
//    }
//
//    public void deleteOption(Long optionId) {
//        optionRepository.deleteById(optionId);
//    }
//
//    public List<MultipleChoiceOption> getOptionsByQuestion(Long questionId) {
//        return optionRepository.findByQuestionId(questionId);
//    }
//
//    @Override
//    public List<MultipleChoiceOption> findByQuestionId(Long questionId) {
//        return optionRepository.findByQuestionId(questionId);
//    }
//
//}
