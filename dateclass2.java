
import java.util.*;

public class dateclass2 extends Thread {

    public static void main(String[] args) {
        Date d = new Date(2021, 5, 23);

        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" + d.getTime());

    }
}
