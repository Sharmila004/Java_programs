// practise set 7.1
// Write a Java method to print the multiplication table of a number n.

import java.util.Scanner;

public class practise40 {

    static void mutiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.printf("\n %d x %d = %d", n, i, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        mutiplicationTable(n);
    }
}
