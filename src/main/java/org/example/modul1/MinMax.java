package org.example.modul1;

import java.util.Arrays;

/**
 * Найти произведение элементов массива, принадлежащих интервалу
 * [min/2, max/2]. Значением этого произведения заменить
 * второй и последний элементы массива
 */
public class MinMax {
    public static void main(String[] args) {
        int[] array = {3, 5, 3, 2};
        int max = array[0];
        int min = array[0];

        System.out.println(Arrays.toString(array));
        // (1; 5/2)
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int lowerBound = min / 2;
        int upperBound = max / 2;
        int product = 1;

        for (int num : array) {
            if (num >= lowerBound && num <= upperBound) {
                product *= num;
            }
        }
        if (array.length > 1) {
            array[1] = product;
        }
        if (array.length > 2) {
            array[array.length - 1] = product;
        }
        System.out.println(Arrays.toString(array));
    }
}
