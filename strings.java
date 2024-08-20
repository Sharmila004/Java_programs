
import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        // Creating Strings using literals and 'new' keyword
        String strLiteral = "CodeWithHarry";   // String literal
        String strLiteral2 = "CodeWithHarry";  // Another string literal with the same value
        String strObject = new String("Keep coding");   // String using 'new' keyword
        String strObject2 = new String("Keep coding");  // Another string object with the same value

        // Demonstrating String comparison
        System.out.println("Comparing String literals with '==': " + (strLiteral == strLiteral2));  // True
        System.out.println("Comparing String objects with '==': " + (strObject == strObject2));     // False
        System.out.println("Comparing String objects with 'equals()': " + strObject.equals(strObject2));  // True

        // Demonstrating different ways to print in Java
        System.out.println("Printing using System.out.print()");  // No newline
        System.out.print("This is printed using print(). ");
        System.out.print("Notice that there's no newline here.\n");

        System.out.println("\nPrinting using System.out.println()");  // Newline included
        System.out.println("This is printed using println().");
        System.out.println("Each println() call prints a new line.");

        // Using printf() and format() methods for formatted output
        int a = 6;
        float b = 5.6454f;
        char ch = 'A';
        String name = "Harry";

        System.out.println("\nPrinting using System.out.printf() and System.out.format()");
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);   // Formatted output
        System.out.format("Character: %c, String: %s\n", ch, name);  // Formatted output

        // Demonstrating string input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word (using next()): ");
        String word = sc.next();  // Reads a single word
        System.out.println("You entered (next()): " + word);

        sc.nextLine();  // Clear the buffer

        System.out.println("Enter a full sentence (using nextLine()): ");
        String sentence = sc.nextLine();  // Reads the entire line
        System.out.println("You entered (nextLine()): " + sentence);
    }
}
