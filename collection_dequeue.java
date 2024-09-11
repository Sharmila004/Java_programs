
import java.util.ArrayDeque;
import java.util.Deque;

public class collection_dequeue {

    public static void main(String[] args) {
        Deque<String> messages = new ArrayDeque<>();
        messages.addLast("Hi!"); // add at the end 
        messages.addFirst("Hello"); // add at the beginning
        System.out.println(messages.pollFirst()); // prints "Hello" (FIFO from front)
        System.out.println(messages.pollLast()); // prints "Hi!" (FIFO from back)        
    }
}
