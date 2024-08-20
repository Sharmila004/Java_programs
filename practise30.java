// practise set 5.9
// Write a program to calculate the sum of the numbers occurring 
// in the multiplication table of 8.


public class practise30 {

    public static void main(String[] args) {
        int num = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int value = i * num;
            // System.out.println(value);
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
