package com.ajith.quizApp.ServiceImpl;

import com.ajith.quizApp.Dao.QuestionRespository;
import com.ajith.quizApp.Services.QuestionService;
import com.ajith.quizApp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRespository questionRespository;

    @Override
    public Questions createQuestion (Questions question) {
        return questionRespository.save(question);
    }

    @Override
    public  List < Questions > getAllQuestions ( ) {
        return  questionRespository.findAll ();
    }
}
