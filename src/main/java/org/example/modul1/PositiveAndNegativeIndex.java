package org.example.modul1;

import java.util.Arrays;

/**
 * Найти индекс первого положительного элемента массва. Все
 * отрицательные элементы, следующие за первым положительным
 * увеличить на модуль суммы отрицательных всего массива.
 */
public class PositiveAndNegativeIndex {
    public static void main(String[] args) {
        int[] array = {-2, 3, -1, -2, 4, -5};
        int firstPositionIndex = -1;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < args.length; i++) {
            if (array[i] > 0) {
                firstPositionIndex = i;
                break;
            }
        }

        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        int absoluteNegativeSum = Math.abs(negativeSum);

        for (int i = firstPositionIndex + 1; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] += absoluteNegativeSum;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
