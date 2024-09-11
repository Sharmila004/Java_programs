
import java.util.HashSet;
import java.util.Set;

public class collection_set {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1); // duplicate ignored
        System.out.println(numbers.size()); // prints 2 (unique)
    }
}
