
public class break_ {

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        //     System.out.println("java is great");
        //     if (i == 2) {
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }
        int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if (i == 2) {
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("loop ended");

        do {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            i++;
        } while (i < 5);
    }
}
