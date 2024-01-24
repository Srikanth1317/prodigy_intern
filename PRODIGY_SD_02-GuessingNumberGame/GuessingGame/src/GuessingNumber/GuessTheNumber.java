package GuessingNumber;
import java.util.*;
public class GuessTheNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Welcome to the Number Guessing Game!");
	    System.out.println("I have selected a number between 1 and 100. Try to guess it.");

	        // Generate a random number between 1 and 100
	    int secretNumber = (int) (Math.random() * 100) + 1;
	    int attempts = 0;
	    boolean hasGuessedCorrectly = false;

	    while (!hasGuessedCorrectly) {
	    	System.out.print("Enter your guess: ");
	        int userGuess = scanner.nextInt();
	        attempts++;

	        if (userGuess == secretNumber) {
	        	hasGuessedCorrectly = true;
	        } else if (userGuess < secretNumber) {
	        	System.out.println("Too low! Try again.");
	        } else {
	        	System.out.println("Too high! Try again.");
	        }
	    }

	    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");

	        // Close the scanner to prevent resource leak
	        scanner.close();
	}
}

