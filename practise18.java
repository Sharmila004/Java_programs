// practise set 4.3
// Calculate income tax paid by an employee to the government 
// as per the slabs mentioned below:

// Income Slab	Tax
// 2.5L – 5.0L  	5%
// 5.0L – 10.0L 	20%
// Above 10.0L	30%
// Note that there is not tax below 2.5L. 
// Take the input amount as input from the user.
import java.util.Scanner;

public class practise18 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your income: ");
            double income = sc.nextDouble();

            double tax = 0;

            if (income > 2.5 && income <= 5.0) {
                tax = (5.0 / 100.0) * (income - 2.5);
            } else if (income > 5.0 && income <= 10.0) {
                tax = (5.0 / 100.0) * (5.0 - 2.5) + (20.0 / 100.0) * (income - 5.0);
            } else if (income > 10.0) {
                tax = (5.0 / 100.0) * (5.0 - 2.5) + (20.0 / 100.0) * (10.0 - 5.0) + (30.0 / 100.0) * (income - 10.0);
            } else {
                System.out.println("You don't have to pay tax");
                return;
            }
            System.out.println("Tax is: " + tax);
        }
    }
}
