package org.example.part2;

import java.util.Arrays;

/**
 * Найти индекс FirstEvenIndex – первого четного значения
 * элемента в массиве. Преобразовать последние FirstEvenIndex
 * элементов массива путем их умножения на значение первого
 * нечетного.
 */
public class EvenIndex {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5};
        int firstEventIndex = -1;
        int firstOdd = -1;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                firstEventIndex = i;
                break;
            }
        }
        if (firstEventIndex != -1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    firstOdd = array[i];
                    break;
                }
            }
            if (firstOdd != -1) {
                for (int i = firstEventIndex; i < array.length; i++) {
                    array[i] *= firstOdd;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
