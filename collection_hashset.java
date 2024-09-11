import java.util.HashSet;

public class collection_hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate ignored
        for (String name : names) {
                System.out.println(name); // order may vary
        }
    }
}