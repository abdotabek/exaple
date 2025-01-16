package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент с индексом кратным 3, в массиве заменить
 * остатком от деления этого элемента на 5.
 */
public class Index {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 9, 6};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                array[i] = array[i] % 5;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
