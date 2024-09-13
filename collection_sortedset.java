
import java.util.SortedSet;
import java.util.TreeSet;

public class collection_sortedset {

    public static void main(String[] args) {
        SortedSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        for (String country : countries) {
            System.out.println(country); // prints in alphabetical order
        }
    }
}
