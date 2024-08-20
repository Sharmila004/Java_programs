// practise set 7.8
//  Repeat problem 2 using Recursion.
// Write a program using functions to print the following pattern:
//       *

//      **
//     ***
//    ****
import java.util.Scanner;

public class practise46 {

    public static void repeat2(int n) {
        if (n == 0) {
            System.out.println(2);
        } else {
            System.out.print(2);
            repeat2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u wnat to repeat the number: ");
        int n = sc.nextInt();
        repeat2(n);
    }
}
