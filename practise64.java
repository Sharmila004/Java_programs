// // practise set 10.5
// // What is the order of constructor execution for the following inheritance hierarchy 
// Base 

// Derived 1
// Derived 2
// Derived obj = new Derived 2( ); 
// Which constructor(s) will be executed & in what order?
// solution:
// constructors will execute in top to bottom order
// base() -> derived1() -> derived2()
// Base class
class Base {

    Base() {
        System.out.println("Base class constructor called");
    }
}

// Derived1 class that inherits from Base
class Derived1 extends Base {

    Derived1() {
        System.out.println("Derived1 class constructor called");
    }
}

// Derived2 class that inherits from Derived1
class Derived2 extends Derived1 {

    Derived2() {
        System.out.println("Derived2 class constructor called");
    }
}

// Main class to test the constructor execution order
public class practise64 {

    public static void main(String[] args) {
        // Creating an object of Derived2 class
        Derived2 obj = new Derived2();
    }
}
