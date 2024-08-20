
public class escapesequences {

    public static void main(String[] args) {
        // Newline (\n)
        System.out.println("This is the first line.\nThis is the second line.");

        // Tab (\t)
        System.out.println("Column 1\tColumn 2\tColumn 3");

        // Backspace (\b)
        System.out.println("Hello\b World!");  // 'o' is removed due to backspace

        // Carriage Return (\r)
        System.out.println("Hello\rWorld");  // 'World' replaces 'Hello'

        // Single Quote (\')
        System.out.println("He said, \'Hello World\'.");

        // Double Quote (\")
        System.out.println("He said, \"Hello World\".");

        // Backslash (\\)
        System.out.println("This is a backslash: \\");

        // Form Feed (\f)
        System.out.println("Hello\fWorld!");  // Typically, \f advances the page to the next "form feed", but behavior may vary

        // Unicode (\u)
        System.out.println("Unicode example: \u00A9");  // Outputs the © symbol

        // Octal (\ddd)
        System.out.println("Octal example: \101");  // Outputs 'A' (ASCII value 65 in octal)

        // Hexadecimal (\xhh)
        System.out.println("Hexadecimal example: \u0041");  // Outputs 'A' (ASCII value 65 in hexadecimal)
    }
}
