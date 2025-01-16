package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент в массиве чье значение лежит вне диапазона [−5, 6] возвести в куб
 */
public class Kub {
    public static void main(String[] args) {
        int[] array = {-2, 0, 6, 8, 9, 5};
        int lowerBound = -5;
        int upperBound = 6;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowerBound || array[i] > upperBound) {
                array[i] = array[i] * array[i] * array[i];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
