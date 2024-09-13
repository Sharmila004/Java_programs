
import java.time.*;

public class clockclass3 extends Thread {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.withYear(2001));

        LocalDate d1 = LocalDate.parse("2021-05-26");
        LocalDate d2 = LocalDate.parse("2021-05-26");

        System.out.println(d1.equals(d));
        System.out.println(d2.equals(d1));
    }
}
