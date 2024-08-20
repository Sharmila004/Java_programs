// practise set 6.4
// Create a Java program to add two matrices of size 2x3.

import java.util.Scanner;

public class practise35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("value for" + i + "," + j);
                int val1 = sc.nextInt();
                matrix1[i][j] = val1;
            }
        }

        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.printf("value for" + a + "," + b);
                int val2 = sc.nextInt();
                matrix2[a][b] = val2;
            }
        }

        System.out.println("Matrix 1:");
        for (int p = 0; p < matrix1.length; p++) {
            for (int q = 0; q < matrix1[p].length; q++) {
                System.out.print(matrix1[p][q] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int r = 0; r < matrix2.length; r++) {
            for (int s = 0; s < matrix2[r].length; s++) {
                System.out.print(matrix2[r][s] + " ");
            }
            System.out.println();
        }

        int[][] sumMatrix = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum Matrix:");
        for (int t = 0; t < sumMatrix.length; t++) {
            for (int u = 0; u < sumMatrix[t].length; u++) {
                System.out.print(sumMatrix[t][u] + " ");
            }
            System.out.println();
        }
    }
}
