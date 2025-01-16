package org.example.one.two.two;

import java.util.Arrays;

/**
 * Элементы массива, которые при делении нацело на собственный
 * номер (индекс + 1) дают нечетное значение увеличить на 2
 */
public class PlusTwo {
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 2};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int indexPlusOne = i + 1;
            if (array[i] % indexPlusOne == 0 && array[i] / indexPlusOne % 2 != 0) {
                array[i] += 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
