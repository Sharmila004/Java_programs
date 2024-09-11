
import java.util.Vector;

public class collection_vector {

    public static void main(String[] args) {
        Vector<Double> prices = new Vector<>();
        prices.add(10.50);
        prices.addElement(12.99); // same as add for Vector
        System.out.println(prices.size()); // prints 2
    }
}
