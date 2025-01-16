package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый элемент в массиве больший 5 умножить на результат
 * целочисленного деления этого элемента на 5
 */
public class IntegerByFive {
    public static void main(String[] args) {
        int[] array = {25, 125, 0, 35};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                array[i] *= array[i] / 5;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
