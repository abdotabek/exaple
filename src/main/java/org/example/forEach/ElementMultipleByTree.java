package org.example.forEach;

/**
 * Определить среднее арифметическое элементов, стоящих на
 * позициях кратных трем
 */
public class ElementMultipleByTree {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 6, 3};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                count++;
                sum += array[i];
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("average element multiple by three : " + average);
        } else {
            System.out.println("elements from array does not exist!");
        }

    }
}
