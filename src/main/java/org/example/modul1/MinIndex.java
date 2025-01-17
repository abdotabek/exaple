package org.example.modul1;

import java.util.Arrays;

/**
 * Найти наименьший элемент массива среди тех, которые находятся
 * на четных позициях. На полученное значение уменьшить элементы
 * с четными индексами массива.
 */
public class MinIndex {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 1}; //  (2, 5, 1) -> min
        int minElement = array[0];

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] < minElement) {
                minElement = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] - minElement;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
