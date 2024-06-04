import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Task 1 of the CodSoft Internship program batch 'May 05 2024' to 'June 05 2024'
public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(20) + 1; // Generates a random number between 1 and 20
        Scanner pk = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter your name: ");
        String playerName = pk.nextLine();

        System.out.println("Guess a number between 1 and 20:");

        while (attempts < 4) {
            guess = pk.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations, " + playerName + "! You guessed the number.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
        System.out.println("The Actual number is:" + numberToGuess);

        // Calculate and display the score
        int score = 0;
        if (attempts == 1) {
            score = 10;
        } else if (attempts == 2) {
            score = 5;
        } else if (attempts == 3) {
            score = 2;
        } else if (attempts == 4) {
            score = 1;
        }
        System.out.println("Your score: " + score);

        // Create a list to store participants and their scores
        List<String> participantNames = new ArrayList<>();
        List<Integer> participantScores = new ArrayList<>();

        // Add participants and scores (you can do this after each game)
        participantNames.add(playerName);
        participantScores.add(score);

        // Display the chart table for the last 5 participants
        System.out.println("\nTop 5 Participants:");
        System.out.println("--------------------");
        for (int i = Math.max(0, participantNames.size() - 5); i < participantNames.size(); i++) {
            System.out.printf("%-15s %d%n", participantNames.get(i), participantScores.get(i));
        }
    }
}