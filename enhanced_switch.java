
import java.util.Scanner;

public class enhanced_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        switch (age) {
            case 18 -> {
                System.out.println("adult");
                System.out.println("you are adult");
            }
            case 21 ->
                System.out.println("2 years past adult");
            case 60 ->
                System.out.println("old age");
            default ->
                System.out.println("enjoy your life!");
        }
    }
}
