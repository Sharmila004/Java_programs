// advantage 2: type-casting is not required

import java.util.ArrayList;

public class java_generics2 {

    public static void main(String[] args) {
        //  without generics
        ArrayList arr1 = new ArrayList();
        arr1.add(10);
        arr1.add("Hello");
        arr1.add(20.4);
        // System.out.println(x); // error
        int x = (int) arr1.get(0); // type casting
        System.out.println(x);

        // with generics
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);

        int z = arr2.get(0);
        System.out.println(z);
    }
}
