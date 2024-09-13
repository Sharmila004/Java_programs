
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter2 extends Thread {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format
        String myDate1 = dt.format(df1); // Creating date string using date and format
        System.out.println("Date in ISO format : " + myDate1);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate2 = dt.format(df2);
        System.out.println("Date in ISO_WEEK_DATE Format  : " + myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate3 = dt.format(df3);
        System.out.println("Date in ISO_WEEK_DATE Format  : " + myDate3);
    }
}
