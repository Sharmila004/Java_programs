// practise set 7.5
// Write a function to print the nth term of the Fibonacci series using recursion.
// refer exercise3.java

// practise set 7.6
// Write a function to find the average of a set of numbers passed as arguments.
public class practise44 {

    public static void average(int... arr) {
        float average = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println(average);
    }

    public static void main(String[] args) {
        average(1);
        average(1, 2);
        average(1, 2, 3);
        average(1, 2, 3, 4);
    }
}
