package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private static Quiz instance;
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }


    public static Quiz getInstance() {
        if (instance == null) {
            instance = new Quiz();
        }
        return instance;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int getQuestionCount() {
        return questions.size();
    }

    public List<Question> getQuestions() {
        return questions;
    }


    public void resetQuiz() {
        questions.clear();
    }
    public int calculateScore(List<String> userAnswers) {
        int score = 0;
        for (int i = 0; i < questions.size() && i < userAnswers.size(); i++) {
            if (questions.get(i).getCorrectAnswer().equalsIgnoreCase(userAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }
}