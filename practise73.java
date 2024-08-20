// practise set 13.2
// Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

class Thread1 extends Thread {

    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("Good morning");
    }
}

public class practise73 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
