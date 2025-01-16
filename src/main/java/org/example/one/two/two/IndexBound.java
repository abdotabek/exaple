package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый второй элемент в массиве, чье значение лежит в диапазоне
 * [−3; 5] заменить 0.
 */
public class IndexBound {
    public static void main(String[] args) {
        int[] array = {4, 8, 9, 3};
        int lowerBound = -3;
        int upperBound = 5;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] >= lowerBound && array[i] <= upperBound) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
