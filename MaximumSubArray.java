package maximumSubArray;

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = scanner.nextInt();
        System.out.print("Enter maximum Limit ");
        int limit = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        limitSum(array, size, limit);

    }

    public static void limitSum(int array[], int size, int limit) {
        int preSum = 0;
        for (int a = 0; a < size; a++) {
            preSum += array[a];
        }
        int i = 0;
        while (preSum > limit) {
            preSum -= array[i];
            i++;
        }
        System.out.println(preSum);
    }

}
