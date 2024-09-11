// practise set 14.1
// write a java program to demonstrate syntax, logical 2 runtime errors.

public class practise77 {

    public static void main(String[] args) {
        // syntax error:
        // int a = 10
        int a = 10; // Corrected syntax

        //logical error:
        // int b = 10;
        // System.out.println("10 - 5 = " + (b + 5));
        int b = 10;
        System.out.println("10 - 5 = " + (b - 5)); // Corrected logic

        // Runtime Error: 
        // int c = 10 / 0;
        try {
            int c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Runtime Error: " + e.getMessage());
        }
    }
}
