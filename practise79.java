// practise 14.3
// write a java program that allows you to keep accessing an array 
// until a valid index is given. if max retries exceed 5 print "Error".

import java.util.Scanner;

public class practise79 {

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
    }
}
