// creating anonymous class by implementing an interface

@FunctionalInterface
interface LambaExp {

    void meth1(int a, int b);
}

class anonymousClass2 {

    public static void main(String[] args) {

        LambaExp obj = (a, b) -> {
            System.out.println("The value of a and b is : " + a + "," + b);
        };
        obj.meth1(5, 10);
    }
}
