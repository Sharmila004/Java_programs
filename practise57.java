// practise set 9.3
// Use a constructor and repeat ➊
// i.e., create a class cylinder and use getter and setters to set its radius and height 

class Cylinder {

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
}

public class practise57 {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(5, 3);
        System.out.println("height: " + cy.getHeight());
        System.out.println("radies" + cy.getRadius());
    }
}
