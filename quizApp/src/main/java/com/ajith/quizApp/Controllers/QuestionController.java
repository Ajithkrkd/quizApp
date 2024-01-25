package com.ajith.quizApp.Controllers;

import com.ajith.quizApp.Services.QuestionService;
import com.ajith.quizApp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/all")
    public String getAllQuestion(){
        return "All questions";
    }


    @PostMapping("/create")
    public String createQuestion(@RequestBody Questions question){
        questionService.createQuestion ( question );
         return "successfully created";
    }
}
