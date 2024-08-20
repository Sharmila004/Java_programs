//  write a program to print the 1st n natural numbers in reverse order

import java.util.Scanner;

public class quiz7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
