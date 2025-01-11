package org.example.forEach;

/**
 * Определить количество тех элементов, которые без остатка делятся
 * на собственный номер (индекс + 1).
 */
public class ElementPerformanceFromIndex {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % (i + 1) == 0) {
                System.out.println("index : " + i + " element : " + array[i]);
                count++;
            }
        }
        System.out.println("count element from performance by index : " + count);
    }
}
