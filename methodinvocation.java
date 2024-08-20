
public class methodinvocation {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        methodinvocation obj = new methodinvocation();
        int c = obj.sum(5, 4);
        System.out.println(c);
    }
}
