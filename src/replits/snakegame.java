package replits;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random; // Import the Random class
import java.util.Scanner; // Import the Scanner class

public class snakegame {
    public static void main(String[] args) {

        String data ="sdkjhfks#";

        data.replace("#", "");

        Scanner input = new Scanner(System.in); // Create a Scanner object
        Random rand = new Random(); // Create a Random object
        int number = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess; // The user's guess
        int numGuesses = 0; // The number of guesses the user has made
        boolean correct = false; // Whether the user has guessed the number correctly

        while (!correct) { // Keep looping until the user guesses the number correctly
            System.out.print("Enter your guess: "); // Prompt the user to enter their guess
            guess = input.nextInt(); // Read the user's guess
            numGuesses++; // Increment the number of guesses

            if (guess == number) { // The user guessed correctly
                correct = true;
                System.out.println("Congratulations, you guessed the number in " + numGuesses + " guesses!");
            } else if (guess < number) { // The user's guess is too low
                System.out.println("Your guess is too low. Try again.");
            } else { // The user's guess is too high
                System.out.println("Your guess is too high. Try again.");
            }
        }
    }
    }

