
public class methods1 {

    // Method to calculate the sum of two numbers
    int mySum(int a, int b) {
        int c = a + b;
        return c; // Return value
    }

    public static void main(String[] args) {
        // Create an object of the SumExample class
        methods1 obj = new methods1();

        // Call the mySum method and store the result
        int result = obj.mySum(5, 7);

        // Print the result
        System.out.println("The sum of 5 and 7 is: " + result);
    }
}
