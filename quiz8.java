// Write a Java program to print the elements of an array in reverse order.

import java.util.Scanner;

public class quiz8 {

    public static void main(String[] args) {
        // int[] arr1 = {120, 78, 218, 198, 60, 92};
        // for (int i = arr1.length - 1; i >= 0; i--) {
        //     System.out.println(arr1[i]);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the legth of array: ");
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("enter vale for position %d ", i);
            arr1[i] = sc.nextInt();
        }
        for (int j = length - 1; j >= 0; j--) {
            System.out.println(arr1[j]);
        }
    }
}
