
import java.time.*;

public class clockclass1 extends Thread {

    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        System.out.println(cl.instant());
    }
}
