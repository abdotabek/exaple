package org.example.forEach;

/**
 * Определить произведение элементов чье значение без остатка
 * делится на 3 и не делится на 2.
 */
public class EventOddNumbers {
    public static void main(String[] args) {
        int[] array = {6, 4, 5, 2, 1, 9, 3};
        int temp = 1;
        boolean found = false;
        for (int num : array) {
            if (num % 3 == 0 && num % 2 != 0) {
                temp *= num;
                found = true;
            }
        }
        if (found) {
            System.out.println("temp : " + temp);
        } else {
            System.out.println("element from array does not exist!");
        }
    }
}
