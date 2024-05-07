package quiz;

public class QuizTime {
	public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Populate the quiz with questions
        Question question1 = new Question("What is the capital of France?", "Paris");
        Question question2 = new Question("What is the largest mammal?", "Blue whale");
        Question question3 = new Question("What is 2 + 2?", "4");

        quiz.add(question1);
        quiz.add(question2);
        quiz.add(question3);

        // Present the quiz
        quiz.giveQuiz();
    }

}
