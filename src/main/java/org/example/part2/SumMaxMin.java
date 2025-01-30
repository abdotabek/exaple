package org.example.part2;

import java.util.Arrays;

public class SumMaxMin {
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 8, 3, 7, 5, 9};

        System.out.println(Arrays.toString(array));

        int middle = array.length / 2;
        int max = array[middle];

        for (int i = middle + 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int min = array[0];
        int minIndex = 0;

        for (int i = 0; i < middle; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        int sum = min + max;
        if (minIndex > 0) {
            array[minIndex - 1] = sum;
        }
        System.out.println(Arrays.toString(array));
    }
}
