package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый нечетный по величине элемент в массиве заменить
 * остатком от деления этого элемента на 3
 */
public class Odd {
    public static void main(String[] args) {
        int[] array = {8, 9, 12, 56};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] % 3;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
