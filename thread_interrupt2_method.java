// Case 2: Interrupting a thread that works normally :

class case2 extends Thread {

    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }
}

public class thread_interrupt2_method extends Thread {

    public static void main(String[] args) {
        case2 t = new case2();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");

    }
}
