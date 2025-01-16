package org.example.one.two.two;

import java.util.Arrays;

/**
 * Каждый четный элемент, в том случае, если он отрицателен,
 * возвести в куб
 */
public class EventAndNegative {
    public static void main(String[] args) {
        int[] array = {-4, -5, -2, 3, 6, 8};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] < 0){
                array[i] = array[i] * array[i] * array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
