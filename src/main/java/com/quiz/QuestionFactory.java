package com.quiz;

public class QuestionFactory {
    public static Question createQuestion(String questionText, String[] options, int correctOptionIndex) {
        return new Question(questionText, options, correctOptionIndex);
    }

    public static Question createQuestion(String questionText, int correctOptionIndex) {
        return new Question(questionText, correctOptionIndex);
    }

    public static Question createQuestion(String questionText, String answerText) {
        return new Question(questionText, answerText);
    }
}