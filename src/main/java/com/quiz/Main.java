package com.quiz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Quiz Application is running...");

        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(new Question("What is the capital of France?", "Paris"));

        System.out.println("Total Questions: " + myQuiz.getQuestionCount());
    }
}