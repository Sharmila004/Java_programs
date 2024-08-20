// practise set 6.3
// Calculate the average marks from an array containing marks 
// of all students in physics using a for-each loop.

import java.util.Scanner;

public class practise34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number fo students in physics class: ");
        int n = sc.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < students.length; i++) {
            System.out.printf("enter the physics mark of student %d", i);
            students[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : students) {
            sum = sum + element;
        }
        int avg = sum / n;
        System.out.println(avg);
    }
}
