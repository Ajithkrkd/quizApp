package com.ajith.quizApp.Dao;


import com.ajith.quizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository< Quiz,Integer> {
}