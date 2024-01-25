package com.ajith.quizApp.Controllers;

import com.ajith.quizApp.Services.QuestionService;
import com.ajith.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/all")
    public ResponseEntity<List< Question >> getAllQuestion(){
       List< Question > questions =  questionService.getAllQuestions();
        return ResponseEntity.status ( HttpStatus.OK ).body ( questions );
    }


    @PostMapping("/create")
    public String createQuestion(@RequestBody Question question){
        questionService.createQuestion ( question );
         return "successfully created";
    }

    @GetMapping("/{id}")
    public  ResponseEntity< Question > getQuestionById(@PathVariable ("id") Integer id){
       return  questionService.getQuestionById(id);
    }

    @GetMapping("/category/{categoryName}")
    public ResponseEntity<List<Question>> getALllQuestionsByCategory(@PathVariable String categoryName){
        return questionService.getALllQuestionsByCategory(categoryName);
    }
}
