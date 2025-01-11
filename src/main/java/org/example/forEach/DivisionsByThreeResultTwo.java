package org.example.forEach;

/**
 * Определить в нем количество тех элементов, которые при делении
 * на 3 дают остаток 2.
 */
public class DivisionsByThreeResultTwo {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 3, 5, 1};
        int count = 0;
        for (int num : array) {
            if (num % 3 == 2) {
                count++;
            }
        }
        System.out.println("count from element divisions from 3 remainder 2 : " + count);
    }
}
