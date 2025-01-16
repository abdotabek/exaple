package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент, стоящий на четной позиции в массиве заменить
 * остатком от деления этого элемента на 6
 */
public class Positions {
    public static void main(String[] args) {
        int[] array = {8, 9, 5, 7};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] % 6;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
