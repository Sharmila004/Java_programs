// practise set 3.4
// Write a Java program to detect double and triple spaces in a string.

public class practise14 {

    public static void main(String[] args) {
        String line = "Hello! My name is Sharmila and i love java";
        String myline = "Hello! My name  is Sharmila and   i love java";
        System.out.println(myline);
        String correctline = myline.replace("   ", " ");
        System.out.println(correctline);
        String correctedline = correctline.replace("  ", " ");
        System.out.println(correctedline);
        System.out.println(line);
    }
}
