
import java.util.ArrayList;

public class collection_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(85);
        scores.add(1, 95); // insert at index 1
        System.out.println(scores.get(2)); // prints 95
    }
}
