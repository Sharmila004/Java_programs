// practise set 1.4
// Write a Java program to convert Kilometers to miles.

import java.util.Scanner;

public class practise4 {

    public static void main(String[] args) {
        System.out.println("Kilometer to Miles Converter!");
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value u want to convert(in kms): ");
        float kmvalue = SC.nextFloat();
        double milevalue = (kmvalue * 0.621371);
        System.out.println("The value on conversion to miles is: ");
        System.out.println(milevalue);
    }
}
