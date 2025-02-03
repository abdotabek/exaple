package org.example.part2;

import java.util.Arrays;

public class Neighbours {
    public static void main(String[] args) {
        int[] array = {4, 6, 7, 3, 4, 6};
        System.out.println(Arrays.toString(array));
        int maxDiff = -1;
        int minDiff = -1;

        for (int i = 1; i < array.length; i++) {
            int diff = array[i] - array[i - 1];

            if (diff > maxDiff) {
                maxDiff = diff;
            }
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        array[1] = minDiff;
        array[array.length - 1] = maxDiff;

        System.out.println("mindiff : " + minDiff);
        System.out.println("maxdiff : " + maxDiff);
        System.out.println(Arrays.toString(array));
    }
}
