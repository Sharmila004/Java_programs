// the main() method will be put to sleep for 2 seconds every time the for loop executes.

public class thread_sleep_method {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000); // Pauses the thread for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Thread 1: " + i);
            }
        });

        t1.start();
    }
}
