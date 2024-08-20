// practise set 7.4
// Write a function to print the following pattern:
//     ****
//     ***
//     **
//     *

public class practise43 {

    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            String char1 = "*";
            String line = char1.repeat(i);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        pattern2(4);
    }
}
