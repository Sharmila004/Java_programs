// practise set 10.3
// Create a method for area and volume in 1 
// i.e., Create a class circle and use inheritance to create another class cylinder from it

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

    public double getcirarea() {
        return Math.PI * radius * radius;
    }

}

class cylinder extends circle {

    int height;

    public void setheight(int height) {
        this.height = height;
    }

    public double getcyarea() {
        return (Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    public double getcyvolume() {
        return Math.PI * radius * radius * height;
    }
}

public class practise62 {

    public static void main(String[] args) {
        circle cr = new circle();
        cr.setradius(3);
        cylinder cy = new cylinder();
        cy.setradius(5);
        cy.setheight(8);
        System.out.println("area of circle: " + cr.getcirarea());
        System.out.println("area of cylinder: " + cy.getcyarea());
        System.out.println("volume of cylinder: " + cy.getcyvolume());
    }
}
