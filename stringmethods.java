
public class stringmethods {

    public static void main(String[] args) {
        String name = "Harry";

        // length()
        int value = name.length();
        System.out.println("Length of the string: " + value);  // Outputs: 5

        // toLowerCase()
        String lstring = name.toLowerCase();
        System.out.println("Lowercase: " + lstring);  // Outputs: harry

        // toUpperCase()
        String ustring = name.toUpperCase();
        System.out.println("Uppercase: " + ustring);  // Outputs: HARRY

        // trim()
        String nonTrimmedString = "     Harry     ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");  // Outputs: 'Harry'

        // substring(int start)
        System.out.println("Substring from index 3: " + name.substring(3));  // Outputs: ry

        // substring(int start, int end)
        System.out.println("Substring from index 1 to 4: " + name.substring(1, 4));  // Outputs: arr

        // replace(‘r’, ‘p’)
        System.out.println("Replace 'r' with 'p': " + name.replace('r', 'p'));  // Outputs: Happy

        // startsWith(“Ha”)
        System.out.println("Starts with 'Ha': " + name.startsWith("Ha"));  // Outputs: true

        // endsWith(“ry”)
        System.out.println("Ends with 'ry': " + name.endsWith("ry"));  // Outputs: true

        // charAt(2)
        System.out.println("Character at index 2: " + name.charAt(2));  // Outputs: r

        // indexOf(“r”)
        System.out.println("Index of 'r': " + name.indexOf('r'));  // Outputs: 2

        // lastIndexOf(“r”)
        String modifiedName = "Harryrryrry";
        System.out.println("Last index of 'r': " + modifiedName.lastIndexOf('r'));  // Outputs: 9

        // equals(“Harry”)
        System.out.println("Equals 'Harry': " + name.equals("Harry"));  // Outputs: true

        // equalsIgnoreCase(“harry”)
        System.out.println("Equals ignoring case 'HarRY': " + name.equalsIgnoreCase("HarRY"));  // Outputs: true

    }
}
