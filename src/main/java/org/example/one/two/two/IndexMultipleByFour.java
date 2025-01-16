package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент массива с индексом кратным 4 умножить на
 * собственный индекс.
 */
public class IndexMultipleByFour {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 7, 9, 6};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 0) {
                array[i] = array[i] * i;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
