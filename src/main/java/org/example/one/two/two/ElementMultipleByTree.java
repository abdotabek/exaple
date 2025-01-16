package org.example.one.two.two;

import java.util.Arrays;

/**
 * .Каждый элемент в массиве чье значение лежит в диапазоне
 * [−1;10] умножить на 3.
 */
public class ElementMultipleByTree {
    public static void main(String[] args) {
        int[] array = {6, 8, 5, 4, 2};
        int lowerBound = -1;
        int upperBound = 10;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowerBound || array[i] < upperBound) {
                array[i] *= 3;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
