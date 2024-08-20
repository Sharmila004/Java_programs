// practise set 1.5
// Write a Java program to detect whether 
// a number entered by the user is an integer or not.

import java.util.Scanner;

public class practise5 {

    public static void main(String[] args) {
        System.out.println("Is it an integer or not?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean value = sc.hasNextInt();
        System.out.println("Trie or false?: ");
        System.out.println("the value you entered is an integer.");
        System.out.println("Answer: " + value);
    }
}
