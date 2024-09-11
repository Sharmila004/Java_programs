// practise set 14.5
// wrap the program in Practise 3, inside a method 
// which throws your custom exception.

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

public class practise81 {

    public static void main(String[] args) {
        try {
            getInputWithRetries();
        } catch (MaxRetriesException e) {
            System.out.println(e);
        }
    }

    public static void getInputWithRetries() throws MaxRetriesException {
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
            throw new MaxRetriesException();
        }
    }
}
