// practise set 16.1
// Create a class and a method with deprecated annotation. 
// What is its effect on program execution?

class MyDeprecated {

    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class practise87 {

    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}

// There is no as such special effect on the program of deprecated annotation. 
// The only thing is that compiler generated a waning if we use deprecated method or class in our program.
