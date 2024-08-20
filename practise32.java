// practise set 6.1
// Create an array of 5 floats and calculate their sum.

import java.util.Scanner;

public class practise32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] nums = new float[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("enter a number for position %d: ", i);
            nums[i] = sc.nextFloat();
        }
        float sum = 0;
        for (int j = 0; j < nums.length; j++) {
            float val = nums[j];
            sum += val;
        }
        System.out.println(sum);

    }
}
