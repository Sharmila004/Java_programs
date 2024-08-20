// practise set 13.3
// Demonstrate gerPriority() and setPriority() methods in Java threads.

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

public class practise74 {

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

// practise set 13.4
// How do you get the state of a given thread in Java?
// Answer: getState() method is used to get the state of a given thread in Java.
// practise set 13.5
// How do you get the reference to the current thread in Java?
// Answer: currentThread() method is used to reference the current thread in Java.
