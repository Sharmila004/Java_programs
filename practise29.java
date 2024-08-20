// practise set 5.8
// What can be done using one type of loop 
// can also be done using the other two types of loops 
// - True or False.

public class practise29 {

    public static void main(String[] args) {
        System.out.println("Using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nUsing a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("\nUsing a do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
