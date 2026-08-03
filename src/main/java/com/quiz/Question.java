package com.quiz;

public class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex;
    private String answerText;

    // Construction for 3 arguments (QuestionText, Options, CorrectIndex)
    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    // Construction for 2 arguments (String, int)
    public Question(String questionText, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = new String[]{};
        this.correctOptionIndex = correctOptionIndex;
    }

    // Construction for 2 arguments (String, String)
    public Question(String questionText, String answerText) {
        this.questionText = questionText;
        this.answerText = answerText;
        this.options = new String[]{};
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public int getCorrectAnswer() {
        return correctOptionIndex;
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOptionIndex;
    }

    public boolean isCorrect(String userAnswer) {
        return answerText != null && answerText.equalsIgnoreCase(userAnswer);
    }
}