
public class methodcalling_withObject {

    static int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        methodcalling_withObject obj = new methodcalling_withObject();
        int sum = obj.sum(5, 3);
        System.out.println(sum);
    }
}
