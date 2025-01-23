package org.example.part2;

import java.util.Arrays;

/**
 * Определить упорядочены ли элементы массива по возрастанию.
 * Если не упорядочены, то определить индекс первого элемента,
 * нарушающего порядок, сам этот элемент увеличить на 2, иначе
 * поменять местами максимум и минимум в массиве.
 */
public class MaxMinSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 9};
        System.out.println(Arrays.toString(array));


        boolean isSorted = true;
        int firstViolationIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                firstViolationIndex = i;
                break;
            }
        }
        if (!isSorted) {
            array[firstViolationIndex] += 2;
        } else {

            int minIndex = 0;
            int maxIndex = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
