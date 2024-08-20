
import java.util.Scanner;

public class ScannerUserInput {

    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        // int input
        System.out.println("Enter int number 1");
        int i1 = sc.nextInt();
        System.out.println("Enter int number 2");
        int i2 = sc.nextInt();
        int isum = i1 + i2;
        System.out.println("Integer Sum: " + isum);

        // float input
        System.out.println("Enter float number 1");
        float f1 = sc.nextFloat();
        System.out.println("Enter float number 2");
        float f2 = sc.nextFloat();
        float fsum = f1 + f2;
        System.out.println("Float Sum: " + fsum);

        System.out.println("Enter a value: ");
        boolean b1 = sc.hasNextInt();
        System.out.println("Is an integer? " + b1);

        // Clearing the buffer
        sc.nextLine();  // This consumes the leftover newline

        // String input
        System.out.println("Enter a word: ");
        String str1 = sc.next();  // Reads the next word
        sc.nextLine();  // Clear the buffer after next()

        System.out.println("Enter full name: ");
        String str2 = sc.nextLine();  // Reads the full line as the name

        System.out.println("1st word: " + str1);
        System.out.println("Full name: " + str2);
    }
}
