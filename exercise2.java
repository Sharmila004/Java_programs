
import java.util.Random;
import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int urscore = 0;
        int myscore = 0;

        System.out.println("lets play for 3 rounds!");

        for (int i = 1; i <= 3; i++) {
            System.out.printf(" \n round %d: \n ", i);

            System.out.println("Enter your choice \n\t (1 for Stone) \n\t (2 for paper) \n\t (3 for scissor):");

            int userInput = sc.nextInt();
            int choice = random.nextInt(3) + 1;

            System.out.println("My choice is " + choice);

            if (choice == userInput) {
                System.out.println("lets try again");
                urscore += 0;
                myscore += 0;
                System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
            } else {
                switch (userInput) {
                    case 1:
                        if (choice == 2) {
                            System.out.println("u: stone and i: paper \n\t i win");
                            myscore += 1;
                            urscore += 0;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        } else if (choice == 3) {
                            System.out.println("u:stone and i: scissor \n\t u win");
                            myscore += 0;
                            urscore += 1;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        }
                        break;
                    case 2:
                        if (choice == 1) {
                            System.out.println("u:paper  and i:stone \n\t u win");
                            myscore += 0;
                            urscore += 1;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        } else if (choice == 3) {
                            System.out.println("u:paper and i:scissor \n\t i win");
                            myscore += 1;
                            urscore += 0;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        }
                        break;
                    case 3:
                        if (choice == 1) {
                            System.out.println("u:scissor and i:stone \n\t i win");
                            myscore += 1;
                            urscore += 0;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        } else if (choice == 2) {
                            System.out.println("u:scissor and i: paper \n\t u win");
                            myscore += 0;
                            urscore += 1;
                            System.out.printf("urscore is %d and myscore is %d", urscore, myscore);
                        }
                        break;
                }
            }
        }

        if (urscore > myscore) {
            System.out.println("\n You win thye game!");
        } else if (urscore < myscore) {
            System.out.println("\n i win the game! better luck next time");
        } else {
            System.out.println("\n its a tie!");
        }
    }
}
