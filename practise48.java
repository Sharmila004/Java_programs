// practise set 7.10
// Repeat problem 3 using an iterative approach.
// i.e., Write a recursive function to calculate the sum of first n natural numbers.

import java.util.Scanner;

public class practise48 {

    public static void repeat3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u wnat to repeat the number: ");
        int n = sc.nextInt();
        repeat3(n);
    }
}
