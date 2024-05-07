package quiz;

import java.util.Scanner;

public class Quiz {
	private Question[] questions;
    private int size;
    private Scanner scanner;

    public Quiz() {
        questions = new Question[25];
        size = 0;
        scanner = new Scanner(System.in);
    }

    public void add(Question question) {
        if (size < 25) {
            questions[size++] = question;
        } else {
            System.out.println("Cannot add more than 25 questions to the quiz.");
        }
    }

    public void giveQuiz() {
        int score = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(questions[i].getQuestionText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (questions[i].checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }
        System.out.println("Quiz ended. Your score: " + score + "/" + size);
    }
    

}
