package org.example.forEach;
/**
 *
 * Определить сколько раз среди значений одномерного массива встретится максимум.
 *
 * */
public class MaxOccurrences  {
    public static void main(String[] args) {
        int[] array = {3, 7, 5, 7, 5, 7, 1};
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        int count = 0;
        for (int num : array) {
            if (num == max) {
                count++;
            }
        }

        System.out.println("max: " + max);
        System.out.println("amount max: " + count);
    }
}