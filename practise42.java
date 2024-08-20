// practise set 7.3
// Write a recursive function to calculate the sum of first n natural numbers.

import java.util.Scanner;

public class practise42 {

    public static void sum(int n) {
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        sum(n);
    }
}
