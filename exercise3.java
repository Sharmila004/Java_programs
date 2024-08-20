// write a java program to print the fibonacci of nth digit in the fibonacci series
// note:
// f(0) = 0
// f(1) = 1
// f(n) = f(n-1) + f(n-2) for all n >= 2

import java.util.Scanner;

public class exercise3 {

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
}
