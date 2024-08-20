
public class methodcalling_withoutObject {

    static int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int sum = sum(5, 3);
        System.out.println(sum);
    }
}
