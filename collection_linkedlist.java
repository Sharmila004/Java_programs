
import java.util.LinkedList;

public class collection_linkedlist {

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Buy groceries");
        tasks.addFirst("Brush teeth"); // add at the beginning
        System.out.println(tasks.removeLast()); // prints "Buy groceries" (FIFO)
    }
}
