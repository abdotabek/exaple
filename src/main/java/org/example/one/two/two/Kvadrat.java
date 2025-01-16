package org.example.one.two.two;

import java.util.Arrays;

/**
 * 14.Элементы массива, чей квадрат меньше 16 увеличить втрое.
 */
public class Kvadrat {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 8, 6, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if ((array[i] * array[i]) < 16) {
                array[i] = array[i] * 3;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
