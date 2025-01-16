package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент в массиве чье значение лежит вне диапазона [−2;
 * 6] увеличить на 12.
 */
public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] array = {4, 8, 7, 5};
        int lowerBound = -2;
        int upperBound = 6;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowerBound || array[i] > upperBound) {
                array[i] += 12;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
