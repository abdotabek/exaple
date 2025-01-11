package org.example.forEach;

/**
 * Определить количество тех элементов, стоящих на четных
 * позициях, которые сами четны.
 */
public class EventIndexAndEventElements {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 1, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 == 0) {
                System.out.println("index : " + i + " item :" + array[i]);
                count++;
            }
        }
        System.out.println("count element from event index and event elements :" + count);
    }
}
