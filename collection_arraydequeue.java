
import java.util.ArrayDeque;

public class collection_arraydequeue {

    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add("Element 1");
        deque.addFirst("Element 2");  // Adds to the front
        deque.addLast("Element 3");   // Adds to the back

        // Printing the elements of deque
        System.out.println("Deque: " + deque);

        // Removing elements from the deque
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());

        // Printing the deque after removals
        System.out.println("Deque after removals: " + deque);
    }
}
