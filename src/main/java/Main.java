import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100 + 1);
        //System.out.println(randomNumber);
        System.out.println("Guess a number between 1-100");
        int guess = 0;
        int guesses = 0;

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            guesses++;
            if (guess < randomNumber) {
                System.out.println("Too low, please try again");
            } else if (guess > randomNumber) {
                System.out.println("Too High, please try again");
            } else {
                System.out.println("Correct, the number was " + randomNumber);
                System.out.println("You guessed "+guesses+" times.");
            }
        }
    }
}
