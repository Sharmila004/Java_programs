// practise set 5.7
// Repeat problem 1 using for/while loop.

public class practise28 {

    public static void main(String[] args) {
        // for (int i = 4; i >= 1; i--) {
        //     String val = "*";
        //     String str = val.repeat(i);
        //     System.out.println(str);
        // }
        int i = 4;
        while (i > +1) {
            String val = "*";
            String str = val.repeat(i);
            System.out.println(str);
            i--;
        }
    }
}
