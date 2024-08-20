
public class logical_operators {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("For Logical AND (&&)...");
        // AND Operator
        System.out.println("a && b: " + (a && b));  // true && false = false
        System.out.println("a && a: " + (a && a));  // true && true = true
        System.out.println("b && a: " + (b && a));  // false && true = false
        System.out.println("b && b: " + (b && b));  // false && false = false

        System.out.println("\nFor Logical OR (||)...");
        // OR Operator
        System.out.println("a || b: " + (a || b));  // true || false = true
        System.out.println("a || a: " + (a || a));  // true || true = true
        System.out.println("b || a: " + (b || a));  // false || true = true
        System.out.println("b || b: " + (b || b));  // false || false = false

        System.out.println("\nFor Logical NOT (!)...");
        // NOT Operator
        System.out.println("!a: " + !a);  // !true = false
        System.out.println("!b: " + !b);  // !false = true
    }
}
