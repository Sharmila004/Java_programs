// repeat question 2 using the calender class
// i.e., use the date class in java to print the time on the following format: 21: 47: 02

import java.util.Calendar;

public class practise84 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
