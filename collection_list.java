
import java.util.ArrayList;
import java.util.List;

public class collection_list {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("carrot");
        vegetables.add("potato");
        System.out.println(vegetables.get(1)); // prints "potato"
    }
}
