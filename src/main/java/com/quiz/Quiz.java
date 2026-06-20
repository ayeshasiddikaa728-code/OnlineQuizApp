package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private final List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public int getQuestionCount() {
        return this.questions.size();
    }

    public List<Question> getQuestions() {
        return questions;
    }
}