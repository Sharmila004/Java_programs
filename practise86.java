// practise set 15.5
// create a set in java. try to store the duplicate values elements 
// inside this set and verify that only one instance is stored.

import java.util.HashSet;

public class practise86 {

    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
