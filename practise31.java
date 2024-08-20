// practise set 5.10
// A do-while loop is executed:

//        At least once
//        At least twice
//       At most once
//  Answer: At least once
// practise set 5.11
// Repeat problem 2 using for loop.
// i.e., Write a program to sum first n even numbers using a while loop.
// practise set 5.2
// Write a program to sum first n even numbers using a while loop.
import java.util.Scanner;

public class practise31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += (2 * i);
        }
        System.out.println(sum);
    }
}
