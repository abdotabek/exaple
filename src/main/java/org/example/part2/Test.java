package org.example.part2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {9, 2, 5, 8, 4};
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.println(Arrays.toString(array));

    }
}
