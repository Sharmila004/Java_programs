// Following are few commonly occurring exceptions in java:

// 1) Null pointer exception
// 2) Arithmetic Exception
// 3) Array Index out of Bound exception
// 4) Illegal Argument Exception
// 5) Number Format Exception
public class common_exceptions {

    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
