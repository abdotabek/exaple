package org.example.part2;

public class Demo {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 5};
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

        int sum = maxDiff + minDiff;
        System.out.println("sum : " + sum);
    }
}
