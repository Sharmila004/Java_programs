
public class continue_ {

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     if (i == 2) {
        //         System.out.println("Ending the loop");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("java is great");
        // }

        int i = 0;
        // while (i < 5) {
        //     i++;
        //     if (i == 2) {
        //         System.out.println("ending the loop");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // }
        // System.out.println("loop ended");

        do {
            i++;
            if (i == 2) {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        } while (i < 5);
        System.out.println("loop ended");
    }
}
