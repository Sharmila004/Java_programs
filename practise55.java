// practise set 9.1
// create a class cylinder and use getter and setters to set its radius and height 

class Cylinder {

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
}

public class practise55 {

    public static void main(String[] args) {
        // question 1
        Cylinder cy = new Cylinder();
        cy.setHeight(5);
        System.out.println("height: " + cy.getHeight());
        cy.setRadius(7);
        System.out.println("radies" + cy.getRadius());
    }
}
