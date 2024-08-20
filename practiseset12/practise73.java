// prcatise set 12.2
// Use a build-in package in java to write a class 
// which displays a message ( by using sout ) 
// after taking input from the user 
package practiseset12;

import java.util.Scanner;

public class practise73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String msg = sc.nextLine();
        System.out.println("your message: " + msg);
        sc.close();
    }
}
