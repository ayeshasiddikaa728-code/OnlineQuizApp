package com.quiz;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {


    @Test
    public void testQuestionCount() {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("Q1", "A"));
        quiz.addQuestion(new Question("Q2", "B"));

        assertEquals(2, quiz.getQuestionCount());
    }


    @Test
    public void testCorrectAnswer() {
        Question q = new Question("Is Java object-oriented?", "Yes");

        assertEquals("Yes", q.getCorrectAnswer());
    }


    @Test
    public void testQuestionText() {
        Question q = new Question("What is 2 + 2?", "4");

        assertEquals("What is 2 + 2?", q.getQuestionText());
    }


    @Test
    public void testEmptyQuiz() {
        Quiz quiz = new Quiz();

        assertEquals(0, quiz.getQuestionCount());
    }


    @Test
    public void testGetQuestionsList() {
        Quiz quiz = new Quiz();
        Question q = new Question("Java is fun?", "Yes");
        quiz.addQuestion(q);

        List<Question> allQuestions = quiz.getQuestions();

        assertNotNull(allQuestions);
        assertEquals(1, allQuestions.size());
        assertEquals("Java is fun?", allQuestions.get(0).getQuestionText());
    }
}