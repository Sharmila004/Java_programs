// practise set 12.1
//  Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package 
package practiseset12;

class Calculator {

    public void Calculate(int a, int b) {
        System.out.println(a + b);
    }
}

class SciCalculator {

    public void Calculate(int a, int b) {
        System.out.println(Math.sin(a + b));
    }
}

class HybridCalculator {

    public void Calculate(int a, int b) {
        System.out.println(a + b);
        System.out.println(Math.sin(a + b));
    }
}

public class practise72 {

    public static void main(String[] args) {
        System.out.println("this is a main method!");
    }
}
