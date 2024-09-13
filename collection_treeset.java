
import java.util.TreeSet;

public class collection_treeset {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements (sorted automatically)
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");

        // Print TreeSet and check first and last elements
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first() + ", Last: " + treeSet.last());
    }
}
