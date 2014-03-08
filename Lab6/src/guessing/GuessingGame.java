/**
 * 
 */
package guessing;

/**
 * @author Rosanna Wubs
 * @version 1.9
 *
 */
//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        //Number the user tries to guess
        int numToGuess;
        //The user's guess
        int guess;
        int highGuess = 0;
        int lowGuess = 0;
        int totalGuess = 0;
        boolean guessRes = false;
        Scanner scan = new Scanner(System.in);
        //randomly generate the number to guess
        Random generator = new Random();
        numToGuess = generator.nextInt(10) + 1;
        //print message asking user to enter a guess
        System.out.println("Please guess a number: ");
        //read in guess
        guess = scan.nextInt();
        //keep going as long as the guess is wrong
        while (guessRes==false) {
            totalGuess++;
            if (guess!=numToGuess) {
                if (guess>numToGuess) {
                    //print message saying guess is wrong
                    //get another guess from the user
                    System.out.println("Your guess was too high. Guess again.");
                    guess = scan.nextInt();
                    highGuess++;
                }
                else {
                    //print message saying guess is wrong
                    //get another guess from the user
                    System.out.println("Your guess was too low. Guess again.");
                    guess = scan.nextInt();
                    lowGuess++;
                }
            }
            else {
                //print message saying guess is right
                System.out.println("Your guess was correct. You took total "
                        + totalGuess + " guesses. There was "
                        + highGuess + " high guesses and "
                        + lowGuess + " low guesses.");
                guessRes = true;

            }
        }
        scan.close();
    }
}
