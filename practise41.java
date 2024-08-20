// practise set 7.2
// Write a program using functions to print the following pattern:
// *
// **
// ***
// ****

public class practise41 {

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            String char1 = "*";
            String line = char1.repeat(i);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        pattern1(4);
    }
}
