// practise set 9.2
// use ➊ to calculate surface and volume of the cylinder 
// i.e., create a class cylinder and use getter and setters to set its radius and height 

class Cylinder {

    // question 1
    private int radius;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    // question 2
    public double volume() {
        return (2 * Math.PI * radius * radius * height);
    }

    public double area() {
        return (2 * (Math.PI * radius * radius) + (2 * 3.14 * radius * height));
    }
}

public class practise56 {

    public static void main(String[] args) {
        // question 1
        Cylinder cy = new Cylinder();
        cy.setHeight(5);
        System.out.println("height: " + cy.getHeight());
        cy.setRadius(7);
        System.out.println("radies" + cy.getRadius());

        // question 2
        System.out.println("Surface area: " + cy.area());
        System.out.println("volume: " + cy.volume());
    }
}
