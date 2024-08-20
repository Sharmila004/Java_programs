// write a program to print the 1st n odd numbers using a for loop

import java.util.Scanner;

public class quiz6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }
    }
}
