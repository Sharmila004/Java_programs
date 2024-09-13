
import java.time.*;

public class clockclass4 extends Thread {

    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = LocalTime.of(13, 18, 29);
        System.out.println("Time before : " + t1);

        LocalTime t2 = t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t2);

        LocalTime t3 = t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t3);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
