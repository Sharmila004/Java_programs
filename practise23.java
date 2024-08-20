// practise set 5.2
// Write a program to sum first n even numbers using a while loop.

import java.util.Scanner;

public class practise23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= num) {
            sum += (2 * i);
            i++;
        }
        System.out.println(sum);
    }
}
