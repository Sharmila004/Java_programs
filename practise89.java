// practise set 16.3
//  Create an interface and generate an instance from it.

interface MyInt {

    void display();
}

public class practise89 {

    public static void main(String[] args) {
        MyInt i = () -> System.out.println("I am display");
        i.display();
    }
}
