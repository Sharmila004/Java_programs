package package1;

import java.util.Scanner;
//import java.util.*;

public class creating_package_in_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}

// How to create a package in Java :
// javac -d creating_package_in_java java 
// The above code creates a packages folder.
// java Harry java 
// The above code creates creating_package_in_java class.
// We can also create inner packages by adding packages inner as the package name.
// These packages once created can be used by other classes.
