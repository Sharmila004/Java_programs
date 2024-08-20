// practise set 5.3
// Write a program to print the multiplication table of a given number n.

import java.util.Scanner;

public class practise24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int ans = i * num;
            System.out.printf("\n %d x %d = %d", num, i, ans);
        }
    }
}
