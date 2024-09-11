
import java.util.Stack;

public class collection_stack {

    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Moby Dick");
        books.push("Pride and Prejudice");

        // Pop and print the top book (LIFO)
        System.out.println(books.pop());  // prints "Pride and Prejudice"
    }
}
