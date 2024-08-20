// practise set 10.1
// Create a class circle and use inheritance to create another class cylinder from it

class circle {

    int radius;
    int cirarea;
    int cirperimeter;

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getradius() {
        return radius;
    }

}

class cylinder extends circle {

    int height;

    public void setheight(int height) {
        this.height = height;
    }

    public int getheight() {
        return height;
    }
}

public class practise60 {

    public static void main(String[] args) {
        circle cr = new circle();
        cr.setradius(3);
        cylinder cy = new cylinder();
        cy.setradius(5);
        cy.setheight(8);
        System.out.println("radius of circle: " + cr.getradius());
        System.out.println("radius of cylinder: " + cy.getradius());
        System.out.println("height of cylinder: " + cy.getheight());
    }
}
