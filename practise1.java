// practise set 1.1
// Write a program to sum three numbers in Java.

import java.util.Scanner;

public class practise1 {

    public static void main(String[] args) {
        System.out.println("calculation of sum of three numbers!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers is: ");
        System.out.println(sum);
    }
}
