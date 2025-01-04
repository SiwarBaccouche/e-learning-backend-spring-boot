///////////         This script is commented since its bugging   //////////////////////////
//////////// when trying to attempt to create a oneToMany relationhsip ////////////////////
// /////////  with the options of the question  when it comes to multiple choices questions ////


//package com.services.questionservice.controllers;
//
//import com.services.questionservice.entities.MultipleChoiceOption;
//import com.services.questionservice.services.MultipleChoiceOptionService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("/e-learning/questions/options")
//@AllArgsConstructor
//public class MultipleChoiceOptionController {
//
//    private final MultipleChoiceOptionService optionService;
//
//    @PostMapping("/{questionId}")
//    public ResponseEntity<MultipleChoiceOption> addOption(
//            @PathVariable Long questionId,
//            @RequestBody String option) {
//        return ResponseEntity.ok(optionService.addOption(questionId, option));
//    }
//
//    @DeleteMapping("/{optionId}")
//    public ResponseEntity<Void> deleteOption(@PathVariable Long optionId) {
//        optionService.deleteOption(optionId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/{questionId}")
//    public ResponseEntity<List<MultipleChoiceOption>> getOptionsByQuestion(
//            @PathVariable Long questionId) {
//        return ResponseEntity.ok(optionService.getOptionsByQuestion(questionId));
//    }
//}
