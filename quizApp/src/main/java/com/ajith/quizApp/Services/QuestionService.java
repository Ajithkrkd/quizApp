package com.ajith.quizApp.Services;


import com.ajith.quizApp.model.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    Question createQuestion (Question question);

     List< Question > getAllQuestions ( );

    ResponseEntity < Question> getQuestionById (Integer id);
}
