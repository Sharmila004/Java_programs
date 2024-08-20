// practise set 6.7
// Write a Java program to find the minimum element in an array.

import java.util.Scanner;

public class practise38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for size of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value for index %d : ", i);
            arr1[i] = sc.nextInt();
        }
        for (int element : arr1) {
            System.out.println(element + " ");
        }
        int minimum = arr1[0];
        for (int i = 0; i < n; i++) {
            if (arr1[i] < minimum) {
                minimum = arr1[i];
            }
        }
        System.out.println("the minimum value in the array is: " + minimum);

    }
}
