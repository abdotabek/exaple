package org.example.part2;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 2, 9};

        System.out.println(Arrays.toString(array));

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println(Arrays.toString(array));
    }
}
