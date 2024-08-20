// Write a program to calculate (recursion must be used) factorial of a number in Java?

import java.util.Scanner;

public class quiz9 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n to calculate n factorial: ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println(factorial);
    }
}
