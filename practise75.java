// practise 13.4
// How do you get state of a given thread.

public class practise75 extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);  // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        practise75 t1 = new practise75();
        System.out.println("State of t1 after creating: " + t1.getState());

        t1.start();
        System.out.println("State of t1 after starting: " + t1.getState());

        try {
            t1.sleep(500);  // Let the thread start and do some work
            System.out.println("State of t1 after sleeping: " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t1.join();  // Waiting for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of t1 after completing: " + t1.getState());
    }
}
