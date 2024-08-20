// practise set 6.5
// Write a Java program to reverse an array.

import java.util.Scanner;

public class practise36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value for index %d: ", i);
            arr1[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Corrected loop to reverse the array
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }

        System.out.println("Reversed array:");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println();

        sc.close();
    }
}
