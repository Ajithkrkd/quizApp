package com.ajith.quizApp.Dao;

import com.ajith.quizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionDao extends JpaRepository < Question, Integer > {

    List< Question> findAllByCategory (String categoryName);
    @Query (value = "SELECT * FROM questions q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
