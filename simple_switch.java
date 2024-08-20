
import java.util.Scanner;

public class simple_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("adult");
                break;
            case 21:
                System.out.println("2 years past adult");
                break;
            case 60:
                System.out.println("old age");
                break;
            default:
                System.out.println("enjoy your life!");
        }
    }
}
