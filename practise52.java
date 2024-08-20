// practise set 8.4
// Create a class Rectangle & problem 3.

import java.util.Scanner;

class rectangle {

    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length * width);
    }
}

public class practise52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("enter the width of rectangle: ");
        int w = sc.nextInt();
        rectangle rect = new rectangle();
        rect.length = l;
        rect.width = w;
        int rectarea = rect.area();
        System.out.println("area of the rectangle: " + rectarea);
        int rectperimeter = rect.perimeter();
        System.out.println("perimeter of the rectangle: " + rectperimeter);

    }
}
