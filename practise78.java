// practise 14.2
// write a java progra, that prints "Ha Ha" during arithmetic exception 
// and "He He" during an illegal argument exception.

public class practise78 {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}
