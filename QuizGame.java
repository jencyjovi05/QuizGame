package quiz;
import java.util.Scanner;

public class QuizGame {
	

	public class QuizApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Define quiz questions, options, and correct answers
	        String[] questions = {
	            "Which country won the FIFA World Cup in 2018?",
	            "Who painted the Mona Lisa?",
	            "Which planet is known as the Red Planet?"
	        };

	        String[] options = {
	            "a) France\tb) Germany\tc) Brazil",
	            "a) Michelangelo\tb) Leonardo da Vinci\tc) Pablo Picasso",
	            "a) Mars\tb) Jupiter\tc) Saturn"
	        };

	        String[] answers = {"a", "b", "a"};

	        int score = 0;

	        System.out.println("Welcome to 'Who Wants to Be a Millionaire?'");
	        System.out.println("Answer the following questions:");

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
	            System.out.println("Options: " + options[i]);
	            System.out.print("Your answer: ");
	            String userAnswer = scanner.nextLine().toLowerCase();

	            if (userAnswer.equals(answers[i])) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	                System.out.println("Incorrect. The correct answer is: " + answers[i]);
	            }
	        }

	        System.out.println("\nQuiz completed! Your final score: " + score + " out of " + questions.length);
	    }
	}


}
