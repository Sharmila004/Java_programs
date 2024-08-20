// practise set 5.1
// Write a program to print the following pattern :
// ****
// ***
// **
// *

public class practise22 {

    public static void main(String[] args) {
        // String str = "*";
        // String str1 = str.repeat(5);
        // System.out.println(str1);

        for (int i = 4; i >= 1; i--) {
            String val = "*";
            String str = val.repeat(i);
            System.out.println(str);
        }
    }
}
