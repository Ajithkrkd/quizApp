package com.ajith.quizApp.ServiceImpl;

import com.ajith.quizApp.Dao.QuestionRepository;
import com.ajith.quizApp.Services.QuestionService;
import com.ajith.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question createQuestion (Question question) {
        return questionRepository.save(question);
    }

    @Override
    public  List < Question > getAllQuestions ( ) {
        return  questionRepository.findAll ();
    }

    @Override
    public ResponseEntity<Question> getQuestionById (Integer id) {
        Optional < Question > question = questionRepository.findById(id);
         return ResponseEntity.status ( HttpStatus.OK).body (question.get ());
    }
}
