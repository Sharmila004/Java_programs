// write a program to print the 1st n natural numbers using do while loop

import java.util.Scanner;

public class quiz5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
