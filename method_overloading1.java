// In Java, method overloading can be performed by two ways listed below :
// 1. By changing the return type of the different methods
// 2. By changing the number of arguments accepted by the method

// 1. 
public class method_overloading1 {

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        method_overloading1 obj = new method_overloading1();
        int c = obj.multiply(5, 4);
        double d = obj.multiply(5.1, 4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " + d);

    }
}
