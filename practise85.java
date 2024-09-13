// practise set 15.4
// repeat question 2 using java.time API
// i.e., use the date class in java to print the time on the following format: 21: 47: 02

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class practise85 {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
    }
}
