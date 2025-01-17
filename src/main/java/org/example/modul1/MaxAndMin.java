package org.example.modul1;

import java.util.Arrays;

/**
 * Найти среднее арифметическое Sr максимума и минимума
 * массива. Далее возвести в куб все элементы меньшие чем Sr.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 6};
        int max = array[0];
        int min = array[0];

        System.out.println(Arrays.toString(array));

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double average = (double) (max + min) / 2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                array[i] = array[i] * array[i] * array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
