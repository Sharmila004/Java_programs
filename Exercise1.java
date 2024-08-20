// exercise 1
// Write a program to calculate the percentage of a given student in the 
// CBSE board exam. His marks from 5 subjects must be taken as input from 
// the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("CBSE Board Percentage Calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math marks(out of 100): ");
        float math = sc.nextFloat();
        System.out.println("Enter Science marks(out of 100): ");
        float sci = sc.nextFloat();
        System.out.println("Enter Social Science marks(out of 100): ");
        float ss = sc.nextFloat();
        System.out.println("Enter Computer Science marks(out of 100): ");
        float cs = sc.nextFloat();
        System.out.println("Enter English marks(out of 100): ");
        float eng = sc.nextFloat();
        float percentage = (((math + sci + ss + cs + eng) / 500) * 100);
        System.out.println("The calculated percentage of the student is: ");
        System.out.println(percentage);
    }
}
