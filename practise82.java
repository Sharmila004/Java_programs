// practise set 15.1
// create an array list and store the names of 10 students inside it.
//  print it using a for each loop.

import java.util.ArrayList;

public class practise82 {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Sharmila");
        ar.add("jeevitha");
        ar.add("shashu");
        ar.add("shar");
        ar.add("anishka");
        ar.add("dibya");
        ar.add("soham");
        ar.add("tanvi");
        ar.add("jeev");
        ar.add("jeevi");
        for (Object o : ar) {
            System.out.println(o);
        }
    }
}
