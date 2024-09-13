
import java.util.*;

public class dateclass1 extends Thread {

    public static void main(String[] args) {
        Date d = new Date();

        Date d1 = new Date(2021, 12, 24);  //both dates are different
        System.out.println(d1.compareTo(d));

    }
}
