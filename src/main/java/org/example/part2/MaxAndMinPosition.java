package org.example.part2;

import java.util.Arrays;

/**
 * Найти максимум среди элементов первой половины массива и
 * минимум среди второй половины массива, которые поменять
 * местами.
 */

public class MaxAndMinPosition {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 1};
        int mid = array.length / 2;

        System.out.println(Arrays.toString(array));
        // first layer
        int maxFirsHalf = array[0];
        int maxIndex = 0;

        for (int i = 0; i < mid; i++) {
            if (array[i] > maxFirsHalf) {
                maxFirsHalf = array[i];
                maxIndex = i;
            }
        }

        int minSecondHalf = array[mid];
        int minIndex = mid;

        for (int i = mid; i < array.length; i++) {
            if (array[i] < minSecondHalf) {
                minSecondHalf = array[i];
                minIndex = i;
            }
        }

        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.print(Arrays.toString(array));
    }
}
