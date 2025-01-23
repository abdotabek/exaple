package org.example.part2;

import java.util.Arrays;

public class Tesr2 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        System.out.println(Arrays.toString(array));

        int temp = array[array.length - 3];
        array[array.length - 3] = array[2];
        array[2] = temp;

        System.out.println(Arrays.toString(array));
    }
}
