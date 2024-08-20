// Create a class Game, which allows a user to play "Guess the Number" game once.

// Game should have the following methods:
// Constructor to generate the random number
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!
import java.util.Random;
import java.util.Scanner;

class game {

    int num;
    int usernum;
    int guesses = 0;

    public int game() {
        Random rd = new Random();
        num = rd.nextInt(10) + 1;
        return num;
    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number u guessed: ");
        usernum = sc.nextInt();
        return usernum;
    }

    public boolean isCorrectNumber() {
        return usernum == num;
    }

    public boolean isGreaterNumber() {
        return usernum > num;
    }

    public boolean isLesserNumber() {
        return usernum < num;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
}

public class exercise5 {

    public static void main(String[] args) {
        game number = new game();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of guesses u want to make: ");
        number.setGuesses(sc.nextInt());
        number.game();
        for (int i = 0; i < number.getGuesses(); i++) {
            number.takeUserInput();
            if (number.isCorrectNumber()) {
                System.out.println("You guessed correctly! The number is " + number.num + ". You guessed it in " + (i + 1) + " tries.");
                break;
            } else {
                System.out.println("Let's try again!");
                if (number.isGreaterNumber()) {
                    System.out.println("Too high!");
                } else if (number.isLesserNumber()) {
                    System.out.println("Too low!");
                }
                if (i == number.getGuesses() - 1) {
                    System.out.println("You've run out of guesses. The correct number was " + number.num + ".");
                }
            }
        }
    }
}
