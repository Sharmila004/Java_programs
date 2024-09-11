
import java.util.PriorityQueue;

public class collection_priorityqueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(5);
        numbers.offer(2);
        numbers.offer(8);
        System.out.println(numbers.poll()); // prints 2 (smallest)
    }
}
