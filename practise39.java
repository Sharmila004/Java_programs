// practise set 6.8
// Write a Java program to find whether an array is sorted or not.

import java.util.Scanner;

public class practise39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value for index %d: ", i);
            arr1[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
