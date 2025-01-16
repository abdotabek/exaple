package org.example.one.two.two;

import java.util.Arrays;

/**
 * К элементам с нечетными значениями массива прибавить значение
 * собственного индекса
 */
public class PlusIndex {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 8, 9, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + i;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
