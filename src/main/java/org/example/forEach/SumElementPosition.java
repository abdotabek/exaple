package org.example.forEach;

/**
 * Определить в нем сумму элементов, стоящих на позициях, чей
 * номер больше записанного в них значения
 */
public class SumElementPosition {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 2, 3};
        int sumPosition = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > array[i]) {
                System.out.println("element at index " + i + ": " + array[i]);
                sumPosition += array[i];
            }
        }
        System.out.println("sum element at position greater than their value : " + sumPosition);
    }
}
