// practise set 5.4
// Write a program to print a multiplication table of 10 in reverse order.

public class practise25 {

    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        int num = 10;
        for (int i = 10; i >= 1; i--) {
            int ans = i * num;
            System.out.printf("\n %d x %d = %d", num, i, ans);
        }
    }
}
