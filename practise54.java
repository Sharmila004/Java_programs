// practise set 8.6
// Repeat problem 4 for a circle.

import java.util.Scanner;

class circle {

    int radius;

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

public class practise54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle: ");
        int r = sc.nextInt();
        circle cr = new circle();
        cr.radius = r;
        double circlea = cr.area();
        System.out.println("area of the circle: " + circlea);
        double circleperimeter = cr.perimeter();
        System.out.println("perimeter of the circle: " + circleperimeter);
    }
}
