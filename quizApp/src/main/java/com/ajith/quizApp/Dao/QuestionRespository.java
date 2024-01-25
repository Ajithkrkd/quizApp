package com.ajith.quizApp.Dao;

import com.ajith.quizApp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRespository extends JpaRepository <Questions, Integer > {
}
