// practise set 10.2
//  Create a class rectangle and use inheritance to create another class
// cuboid, try to keep it as close to the real-world scenario as possible 

class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void displayRectangleInfo() {
        System.out.println("Rectangle [Length: " + length + ", Width: " + width + "]");
    }
}

class Cuboid extends Rectangle {

    private int height;

    public Cuboid(int length, int width, int height) {
        super(length, width); // Call to the parent class (Rectangle) constructor
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double calculateSurfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }

    public double calculateVolume() {
        return getLength() * getWidth() * height;
    }

    public void displayCuboidInfo() {
        System.out.println("Cuboid [Length: " + getLength() + ", Width: " + getWidth() + ", Height: " + height + "]");
    }
}

public class practise61 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.displayRectangleInfo();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Cuboid cuboid = new Cuboid(4, 5, 6);
        cuboid.displayCuboidInfo();
        System.out.println("Surface Area of Cuboid: " + cuboid.calculateSurfaceArea());
        System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
    }
}
