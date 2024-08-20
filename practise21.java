// practise set 4.6
// Write a program to find out the type of website from the URL:

// .com – commercial website
// .org – organization website
// .in – Indian website
import java.util.Scanner;

public class practise21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website with its url (.com, .org, .in): ");
        String website = sc.nextLine();
        Boolean commercial = website.endsWith(".com");
        Boolean organization = website.endsWith(".org");
        Boolean indian = website.endsWith(".in");
        if (commercial) {
            System.out.println("It is a commercial website");
        } else if (organization) {
            System.out.println("It is an organizational website");
        } else if (indian) {
            System.out.println("It is an indian website");
        } else {
            System.out.println("invalid url");
        }
    }
}
