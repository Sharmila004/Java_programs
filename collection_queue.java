
import java.util.ArrayDeque;
import java.util.Queue;

public class collection_queue {

    public static void main(String[] args) {
        Queue<String> messages = new ArrayDeque<>();
        messages.offer("Hello");
        messages.offer("World");
        System.out.println(messages.poll()); // prints "Hello" (FIFO)
    }
}
