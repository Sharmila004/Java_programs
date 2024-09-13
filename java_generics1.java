//  advantage 1: bugs can be detected at compile time.

import java.util.ArrayList;

public class java_generics1 {

    public static void main(String[] args) {
        // without generics

        ArrayList arr1 = new ArrayList();
        arr1.add(10);
        arr1.add("Hello");
        arr1.add(20.4);

        System.out.println(arr1);

        // with generics
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        // arr2.add("Hello"); // error
        // arr2.add(20.4); // error

        System.out.println(arr2);
    }
}
