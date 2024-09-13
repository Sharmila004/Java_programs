// practise set 16.2
// Suppress the warning generated in question number 1.
// Create a class and a method with deprecated annotation. 

class MyDeprecated {

    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class practise88 {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}
