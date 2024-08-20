
public class operators {

    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
        int b = 6;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));        // 4 + 6
        System.out.println("Subtraction: " + (a - b));     // 4 - 6
        System.out.println("Multiplication: " + (a * b));  // 4 * 6
        System.out.println("Division: " + (b / a));        // 6 / 4
        System.out.println("Modulo: " + (b % a));          // 6 % 4
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = 9;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 3; // c = c / 3
        System.out.println("c /= 3: " + c);
        c %= 4; // c = c % 4
        System.out.println("c %= 4: " + c);
        System.out.println();

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("64 < 6: " + (64 < 6));   // Less than
        System.out.println("64 > 6: " + (64 > 6));   // Greater than
        System.out.println("64 == 64: " + (64 == 64)); // Equal to
        System.out.println("64 != 64: " + (64 != 64)); // Not equal to
        System.out.println("64 <= 64: " + (64 <= 64)); // Less than or equal to
        System.out.println("64 >= 64: " + (64 >= 64)); // Greater than or equal to
        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("64 > 5 && 64 > 98: " + (64 > 5 && 64 > 98));  // Logical AND
        System.out.println("64 > 5 || 64 > 98: " + (64 > 5 || 64 > 98));  // Logical OR
        System.out.println("!false: " + !false);  // Logical NOT
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("2 & 3: " + (2 & 3));  // AND
        System.out.println("2 | 3: " + (2 | 3));  // OR
        System.out.println("2 ^ 3: " + (2 ^ 3));  // XOR
        System.out.println("~2: " + (~2));        // NOT
        System.out.println("2 << 1: " + (2 << 1)); // Left Shift
        System.out.println("2 >> 1: " + (2 >> 1)); // Right Shift
    }
}
