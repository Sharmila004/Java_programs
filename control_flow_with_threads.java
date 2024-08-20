
public class control_flow_with_threads extends Thread {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        control_flow_with_threads func1 = new control_flow_with_threads();
        func1.start();
        control_flow_with_threads func2 = new control_flow_with_threads();
        func2.start();
    }
    // Func1() and Func2() are called inside the main function, 
    // but none of the two functions is waiting for the execution of the other function. 
    // Both the functions are getting executed concurrently.
}
