// Write a java program that allows to keep accessing an array until a valid index is given by the user.

public class quiz12 {

    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println("Array element: " + array[2]); // This will throw ArrayIndexOutOfBoundsException

            try {
                int a = 10;
                int b = 0;
                int result = a / b; // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: ArithmeticException caught");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught");
        }

        System.out.println("Program continues...");
    }
}
