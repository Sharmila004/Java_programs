// practise set 1.3
// Write a Java program that asks the user to 
// enter his/her name and greets them with 
// “Hello <name>, have a good day” text.

import java.util.Scanner;

public class practise3 {

    public static void main(String[] Args) {
        System.out.println("Greeting program!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day");
    }
}
