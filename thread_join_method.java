
public class thread_join_method {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        try {
            t1.join(); // Main thread waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // t2 starts after t1 completes
    }
}
