package org.example.forEach;

public class MaxSumOfNeighbors {
    public static void main(String[] args) {
        int[] array = {1, 9, 3, 7, 2, 8};

        int maxSum = array[0] + array[1];
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int currentSum = array[i] + array[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                index = i;
            }
        }
        System.out.println("maxSum : " + maxSum);
        System.out.println("item : " + array[index] + "and " + array[index + 1]);
    }
}
