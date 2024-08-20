// practise set 5.5
// Write a program to find the factorial of a given number using for loops.

import java.util.Scanner;

public class practise26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        // int i = 1;
        // while(i<num){
        //     factorial *= i;
        //     i++;
        // }
        // System.out.println(factorial);
    }
}
