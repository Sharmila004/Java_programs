// What will be the value of the following expression(x).
// int y=7;
// int x = ++y*8;
// value of x?
// char a = ‘B’;
// a++; (a is not ‘C’)

public class quiz3 {

    public static void main(String[] args) {
        int y = 7;
        int x = ++y * 8;  // y becomes 8, x becomes 64
        System.out.println("Value of x: " + x);

        char a = 'B';
        a++;  // a becomes 'C'
        System.out.println("Value of a: " + a);
    }
}
