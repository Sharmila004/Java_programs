// practise set 13.1
// Write a program to print "Good morning" and "Welcome" continuously 
// on the screen in Java using threads.

class Thread1 extends Thread {

    public void run() {
        System.out.println("Welcome");
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("Good morning");
    }
}

public class practise72 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
