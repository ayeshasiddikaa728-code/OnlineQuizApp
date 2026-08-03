package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private static Quiz instance;
    private final List<Question> questions;
    private ScoreTracker scoreTracker;

    private Quiz() {
        questions = new ArrayList<>();
        scoreTracker = new ScoreTracker();
    }

    public static Quiz getInstance() {
        if (instance == null) {
            instance = new Quiz();
        }
        return instance;
    }

    public void addQuestion(Question question) {
        if (question != null) {
            questions.add(question);
        }
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getQuestionCount() {
        return questions.size();
    }

    public ScoreTracker getScoreTracker() {
        return scoreTracker;
    }

    // List<String> রিসিভ করার জন্য মেথড (QuizTest-এর জন্য)
    public int calculateScore(List<String> userAnswers) {
        int score = 0;
        if (userAnswers == null) return score;

        for (int i = 0; i < questions.size() && i < userAnswers.size(); i++) {
            if (questions.get(i).isCorrect(userAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }

    public void resetQuiz() {
        questions.clear();
        scoreTracker = new ScoreTracker();
    }
}