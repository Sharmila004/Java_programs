
import java.util.HashSet;

public class collection_hashset_detailed {

    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        myHashSet.remove(3);
        System.out.println("after removing 3:" + myHashSet);
        System.out.println("is it empty?" + myHashSet.isEmpty());
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println(myHashSet);
        System.out.println("is it empty after clearing?" + myHashSet.isEmpty());
        System.out.println("size is: " + myHashSet.size());

    }
}
