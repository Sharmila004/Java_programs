// practise 13.5
// how do you get the reference to the current thread in java?

public class practise76 {

    public static void main(String[] args) {
        // Getting the reference to the current thread
        Thread currentThread = Thread.currentThread();

        // Printing the details of the current thread
        System.out.println("Current thread: " + currentThread);
        System.out.println("Thread name: " + currentThread.getName());
        System.out.println("Thread ID: " + currentThread.getId());
        System.out.println("Thread state: " + currentThread.getState());
        System.out.println("Thread priority: " + currentThread.getPriority());
    }
}
