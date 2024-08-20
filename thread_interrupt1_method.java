// Case 1: Interrupting a thread that doesn’t stop working :

class case1 extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
                Thread.sleep(4000);
                /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */

            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread is running");

    }
}

public class thread_interrupt1_method extends Thread {

    public static void main(String[] args) {
        case1 t = new case1();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");

    }
}
