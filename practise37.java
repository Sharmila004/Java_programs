// practise set 6.6
// Write a Java program to find the maximum element in an array.

import java.util.Scanner;

public class practise37 {

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
        int maximum = arr1[0];
        for (int j = 1; j < n; j++) {
            if (arr1[j] > maximum) {
                maximum = arr1[j];
            }
        }
        System.out.println("the maximum value in the array is: " + maximum);
    }
}
