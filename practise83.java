// practise set 15.2
// use the date class in java to print the time on the following format: 21: 47: 02

import java.util.Date;

public class practise83 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
}
