
public class arrays1 {

    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
         */

        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        int[] marks = new int[5];

        // 2. Declaration and then memory allocation
        int[] scores;
        scores = new int[5];
        // Initialization
        scores[0] = 100;
        scores[1] = 60;
        scores[2] = 70;
        scores[3] = 90;
        scores[4] = 86;

        // 3. Declaration, memory allocation, and initialization together
        int[] grades = {98, 45, 79, 99, 80};

        // Accessing Array Elements
        System.out.println("Accessing individual elements:");
        System.out.println("First element: " + grades[0]);
        System.out.println("Second element: " + grades[1]);
        System.out.println("Third element: " + grades[2]);
        System.out.println("Fourth element: " + grades[3]);
        System.out.println("Fifth element: " + grades[4]);

        // Displaying the array using a for loop
        System.out.println("\nDisplaying the array using a for loop:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Element at index " + i + ": " + grades[i]);
        }

        // Display the length of the array
        System.out.println("\nThe length of the array is: " + grades.length);
    }
}
