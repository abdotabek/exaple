package org.example.part2;

/**
 * есть массиве элемент 1 и после этого элемента если придет 2 должно выйти труд без разнице в каком индексе она стоит главное что она стоит после 1
 */
public class Array {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 1, 5, 2};
        int temp = -1;
        int item = 0;
        for (int j : array) {
            if (j == 1) {
                temp = 1;
            } else if (temp != -1 && j == 2) {
                item++;
            }
        }
        System.out.println("item : " + item);
    }
}
