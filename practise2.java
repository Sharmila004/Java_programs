// practise set 1.2
// Write a program to calculate CGPA using marks of three subjects (out of 100)

import java.util.Scanner;

public class practise2 {

    public static void main(String[] args) {
        System.out.println("Calculation fo CGPA!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math marks(out of 100): ");
        float math = sc.nextFloat();
        float mathgpa = math / 10;
        System.out.println("Enter Science marks(out of 100): ");
        float sci = sc.nextFloat();
        float scigpa = sci / 10;
        System.out.println("Enter computer science marks(out of 100): ");
        float cs = sc.nextFloat();
        float csgpa = cs / 10;
        float cgpa = (mathgpa + scigpa + csgpa) / 3;
        System.out.println("the Calculated CGPA of three subjects is: ");
        System.out.println(cgpa);
    }
}
