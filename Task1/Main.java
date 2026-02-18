import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameSaurav {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean isGuessed = false;

            System.out.println("\n Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.\n");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess → ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    isGuessed = true;
                    break;
                } else if (guess > randomNumber) {
                    System.out.println(" Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!isGuessed) {
                System.out.println("\n Out of attempts!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.println(" Current Score: " + score);
            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThanks for playing! Final Score: " + score);
        sc.close();
    }
}
