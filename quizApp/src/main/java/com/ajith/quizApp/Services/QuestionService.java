package com.ajith.quizApp.Services;


import com.ajith.quizApp.model.Questions;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {

    Questions createQuestion (Questions question);

     List<Questions> getAllQuestions ( );
}
