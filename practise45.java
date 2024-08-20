// practise set 7.7
// Repeat problem 4 using Recursion.
// i.e., 
// Write a function to print the following pattern:
//     ****
//     ***
//     **
//     *

import java.util.Scanner;

public class practise45 {

    public static void repeat4(int n) {
        if (n == 0) {
            System.out.println(4);
        } else {
            System.out.print(4);
            repeat4(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u wnat to repeat the number: ");
        int n = sc.nextInt();
        repeat4(n);
    }
}
