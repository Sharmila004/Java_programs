// practise set 14.4
// modify the program in practise 14.3 to throw a custom exception 
// if max tries are reached
// refer practise79.java for practise set 14.4

import java.util.Scanner;

class MaxRetriesException extends Exception {

    @Override
    public String toString() {
        return "Max retries exceeded";
    }

    @Override
    public String getMessage() {
        return "You have reached the maximum number of retries";
    }
}

public class practise80 {

    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5) {
            // question 4
            try {
                throw new MaxRetriesException();
            } catch (MaxRetriesException e) {
                System.out.println(e);
            }
        }
    }
}
