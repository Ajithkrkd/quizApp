package com.ajith.quizApp.Dao;

import com.ajith.quizApp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionRespository extends JpaRepository <Questions, Integer > {

}
