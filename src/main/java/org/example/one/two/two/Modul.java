package org.example.one.two.two;

import java.util.Arrays;

public class Modul {
    public static void main(String[] args) {
        int[] array = {3, -8, 5, 10, -12, 6, 7, -15};

        // Вывод массива до преобразования
        System.out.println("Массив до преобразования: " + Arrays.toString(array));

        // Преобразование массива
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > 7) {
                array[i] = 0; // Обнуляем элементы
            }
        }

        // Вывод массива после преобразования
        System.out.println("Массив после преобразования: " + Arrays.toString(array));
    }
}
