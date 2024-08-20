// practise set 11.2
// Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
// i.e., Create an abstract class pen with methods write () and refill () as abstract methods 

abstract class Pen {

    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {

    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

public class practise66 {

    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.refill();
        pen.write();
        pen.changeNib();
    }

}
