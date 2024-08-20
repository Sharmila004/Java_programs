// practise set 4.5
// Write a Java program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

public class practise20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year(yyyy): ");
        int year = sc.nextInt();

        // Boolean condition1 = (year % 4 == 0);
        // Boolean Condition2 = ((year % 100 != 0) || (year % 4 == 0));
        // Boolean isLeapYear = (condition1 && Condition2);
        // if (isLeapYear) {
        //     System.out.println("it is a leap year");
        // } else {
        //     System.out.println("it is not a leap year");
        // }
        // A year is a leap year if it is divisible by 4 but not by 100, 
        // except when it is also divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap");
                } else {
                    System.out.println("not leap");
                }
            } else {
                System.out.println("leap");
            }
        } else {
            System.out.println("not leap");
        }
    }
}
