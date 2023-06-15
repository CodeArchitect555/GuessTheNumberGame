import java.util.Random;
import java.util.Scanner;
//Still in progress
public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int NumberOfGuesses = 0;
        int x = 5;
        int y = 10;
        while (NumberOfGuesses < 10) {
            System.out.println("Guess a number between 0 and 100");
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println(guess +" is too high guess again");
            } else if (guess < number) {
                System.out.println(guess + " is too low, guess again");
            } else if (guess==number){
                System.out.println("you guessed it!");
                break;
            }
            NumberOfGuesses ++;
        }
    }
}