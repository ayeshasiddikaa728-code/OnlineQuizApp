package com.quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = Quiz.getInstance();

        // QuestionFactory
        quiz.addQuestion(QuestionFactory.createQuestion(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. London", "3. Paris", "4. Madrid"},
                2
        ));

        quiz.addQuestion(QuestionFactory.createQuestion(
                "Which pattern ensures a class has only one instance?",
                new String[]{"1. Factory", "2. Singleton", "3. Observer", "4. Builder"},
                1
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to the Online Quiz App ---");

        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            Question q = quiz.getQuestions().get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestionText());
            for (String opt : q.getOptions()) {
                System.out.println(opt);
            }

            System.out.print("Your answer (1-4): ");
            int userChoice = scanner.nextInt() - 1;

            boolean correct = q.isCorrect(userChoice);
            quiz.getScoreTracker().updateScore(correct);

            if (correct) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!");
            }
        }

        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your Final Score: " + quiz.getScoreTracker().getScore() + "/" + quiz.getQuestions().size());
    }
}