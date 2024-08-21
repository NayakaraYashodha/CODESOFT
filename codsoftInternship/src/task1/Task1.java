package task1;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        boolean playAgain = true;
	        int totalRounds = 0;
	        int totalScore = 0;

	        while (playAgain) {
	            totalRounds++;
	            int numberToGuess = random.nextInt(100) + 1;
	            int attempts = 0;
	            int maxAttempts = 7;
	            boolean hasGuessedCorrectly = false;

	            System.out.println("Round " + totalRounds + ": Guess the number between 1 and 100.");
	            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == numberToGuess) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    totalScore += (maxAttempts - attempts + 1);
	                    hasGuessedCorrectly = true;
	                    break;
	                } else if (userGuess < numberToGuess) {
	                    System.out.println("Your guess is too low.");
	                } else {
	                    System.out.println("Your guess is too high.");
	                }

	                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
	            }

	            if (!hasGuessedCorrectly) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess);
	            }

	            System.out.println("Your current score: " + totalScore);

	            System.out.print("Do you want to play another round? (yes/no): ");
	            scanner.nextLine();
	            String response = scanner.nextLine();
	            playAgain = response.equalsIgnoreCase("yes");

	            if (!playAgain) {
	                System.out.println("Thanks for playing! Your final score after " + totalRounds + " rounds is " + totalScore + ".");
	            }
	        }

	        scanner.close();
	    }
	}
