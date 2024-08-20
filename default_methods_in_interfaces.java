
interface Animal {

    default void say() {
        System.out.println("Hello, this is default method");
    }

    void bark();
}

public class default_methods_in_interfaces implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        default_methods_in_interfaces obj1 = new default_methods_in_interfaces();
        obj1.bark();
        obj1.say();
    }

}
