package com.quiz;

public class ScoreTracker {
    private int score = 0;

    public void updateScore(boolean isCorrect) {
        if (isCorrect) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        this.score = 0;
    }
}