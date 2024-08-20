// practise set 8.3
//  Create a class Square with a method to initialize its side, calculating area, perimeter etc.

import java.util.Scanner;

class square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return side * 4;
    }
}

public class practise51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square: ");
        int a = sc.nextInt();
        square sq = new square();
        sq.side = a;
        int sqarea = sq.area();
        System.out.println("area of the square: " + sqarea);
        int sqperimeter = sq.perimeter();
        System.out.println("perimeter of the square: " + sqperimeter);

    }
}
