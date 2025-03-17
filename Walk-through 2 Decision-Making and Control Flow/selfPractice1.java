import java.util.Scanner;
import java.util.Random;

public class selfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to Guessing Game!");
        System.out.println("I have chosen a number between 1 and 10. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNum) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNum);
        scanner.close();
    }
}
