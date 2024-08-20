// In Java, method overloading can be performed by two ways listed below :
// 1. By changing the return type of the different methods
// 2. By changing the number of arguments accepted by the method

// 2. 
public class method_overloading2 {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        method_overloading2 obj = new method_overloading2();
        int c = obj.multiply(5, 4);
        int d = obj.multiply(5, 4, 3);
        System.out.println(c);
        System.out.println(d);
    }
}
