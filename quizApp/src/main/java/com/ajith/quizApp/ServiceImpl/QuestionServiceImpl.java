package com.ajith.quizApp.ServiceImpl;

import com.ajith.quizApp.Dao.QuestionDao;
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
    private QuestionDao questionDao;

    @Override
    public Question createQuestion (Question question) {
        return questionDao.save(question);
    }

    @Override
    public  List < Question > getAllQuestions ( ) {
        return  questionDao.findAll ();
    }

    @Override
    public ResponseEntity<Question> getQuestionById (Integer id) {
        Optional < Question > question = questionDao.findById(id);
         return ResponseEntity.status ( HttpStatus.OK).body (question.get ());
    }

    @Override
    public ResponseEntity < List < Question > > getALllQuestionsByCategory (String categoryName) {
        return ResponseEntity.status ( HttpStatus.OK).body ( questionDao.findAllByCategory (categoryName));
    }
}
