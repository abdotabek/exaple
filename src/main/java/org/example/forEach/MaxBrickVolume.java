package org.example.forEach;

import java.util.Random;

/**
 * Инициализировать массивы a, b, c из n чисел случайными
 * значениями. Понимая, что a[i], b[i], c[i] обозначают длины
 * ребер кирпичей, определить кирпич с максимальным объемом.
 */
public class MaxBrickVolume {
    public static void main(String[] args) {
        int n = 3;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        initialization(a);
        initialization(b);
        initialization(c);

        for (int i = 0; i < n; i++) {
            System.out.printf("Кирпич %d: a = %d, b = %d, c = %d%n", i + 1, a[i], b[i], c[i]);
        }

        int maxVolumeIndex = findMaxVolumeIndex(a, b, c);
        int maxVolume = a[maxVolumeIndex] * b[maxVolumeIndex] * c[maxVolumeIndex];

        System.out.printf("Кирпич с максимальным объемом: %d (a = %d, b = %d, c = %d, объем = %d)%n",
                maxVolumeIndex + 1, a[maxVolumeIndex], b[maxVolumeIndex], c[maxVolumeIndex], maxVolume);
    }

    public static void initialization(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
        }
    }

    public static int findMaxVolumeIndex(int[] a, int[] b, int[] c) {
        int maxVolumeIndex = 0;
        int maxVolume = a[0] * b[0] * c[0];

        for (int i = 1; i < a.length; i++) {
            int volume = a[i] * b[i] * c[i];
            if (volume > maxVolume) {
                maxVolume = volume;
                maxVolumeIndex = i;
            }
        }
        return maxVolumeIndex;
    }
}
