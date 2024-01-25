package com.ajith.quizApp.Dao;

import com.ajith.quizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository < Question, Integer > {

}
