package com.quiz;

import org.junit.jupiter.api.Test;
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
}