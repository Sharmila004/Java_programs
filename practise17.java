// practise set 4.2
// Write a program to find out whether a student is pass or fail; 
// if it requires a total of 40% and at least 33% in each subject to pass. 
// Assume 3 subjects and take marks as input from the user.

import java.util.Scanner;

public class practise17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Result determination program");

            System.out.println("Enter your math marks(out of 10): ");
            int math = sc.nextInt();
            System.out.println("Enter your science marks(out of 10): ");
            int sci = sc.nextInt();
            System.out.println("Enter your computer science marks(out of 10): ");
            int cs = sc.nextInt();

            double mathpercent = (math / 10.0) * 100.0;
            double scipercent = (sci / 10.0) * 100.0;
            double cspercent = (cs / 10.0) * 100.0;
            double eachpercent = 33;

            double studentpercent = ((math + sci + cs) / 30.0) * 100.0;
            double totalpercent = 40.0;

            Boolean condition = (studentpercent >= totalpercent);
            Boolean mathcondition = (mathpercent >= eachpercent);
            Boolean scicondition = (scipercent >= eachpercent);
            Boolean cscondition = (cspercent >= eachpercent);

            if (condition && mathcondition && scicondition && cscondition) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
            //     System.out.println(mathpercent);
            //     System.out.println(scipercent);
            //     System.out.println(cspercent);
            //     System.out.println(eachpercent);
            //     System.out.println(totalpercent);
            //     System.out.println(studentpercent);

            //     System.out.println(condition);
            //     System.out.println(mathcondition);
            //     System.out.println(scicondition);
            //     System.out.println(cscondition);
        }
    }
}
