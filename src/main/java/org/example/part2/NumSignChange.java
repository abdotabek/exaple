package org.example.part2;

import java.util.Arrays;

/**
 * Определить количество смен знака (NumSignChange) для
 * элементов массива. Если NumSignChange > 0 , то все элементы
 * после A[NumSignChange] заменить значением кубом разностей
 * между первым и минимальным элементами массива.
 */
public class NumSignChange {
    public static void main(String[] args) {
        int[] array = {3, -5, 6, -8, 3};
        int numSignChange = 0;
        int first = array[0];
        int minElement = array[0];
        int cubeOfDifference;

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
            // Проверяем на смену знака между текущим и следующим элементом
            if ((array[i] > 0 && array[i + 1] < 0) || (array[i] < 0 && array[i + 1] > 0)) {
                numSignChange++;
            }
        }

        // Не забываем сравнить последний элемент массива с минимальным
        if (array[array.length - 1] < minElement) {
            minElement = array[array.length - 1];
        }

        // Вычисляем куб разности
        cubeOfDifference = (first - minElement) * (first - minElement) * (first - minElement);
        System.out.println("numSignChange: " + numSignChange);

        if (numSignChange > 0) {
            for (int i = numSignChange; i < array.length; i++) {
                array[i] = cubeOfDifference;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
