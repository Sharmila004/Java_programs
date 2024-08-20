// practise set 10.4
// create methods for area & volume in 2 also create getters and setters
// Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 

class Rectangle {

    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public double getRectArea() {
        return length * width;
    }
}

class Cuboid extends Rectangle {

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getCuboidArea() {
        return 2 * ((getLength() * getWidth()) + (getLength() * height) + (getWidth() * height));
    }

    public double getCuboidVolume() {
        return getLength() * getWidth() * height;
    }
}

public class practise63 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(3);
        rect.setWidth(5);

        Cuboid cub = new Cuboid();
        cub.setLength(5);
        cub.setWidth(8);
        cub.setHeight(10);

        System.out.println("Area of Rectangle: " + rect.getRectArea());
        System.out.println("Surface Area of Cuboid: " + cub.getCuboidArea());
        System.out.println("Volume of Cuboid: " + cub.getCuboidVolume());
    }
}
