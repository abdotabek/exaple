package org.example.modul1;

public class MultiArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 3};  // Пример массива

        int firstPositive = array[0];  // Инициализация первого положительного элемента
        int secondPositive = -1;       // Инициализация второго положительного элемента

        // Ищем второе положительное число
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0) {
                secondPositive = array[i];
                break;  // Как только нашли второе положительное число, выходим из цикла
            }
        }

        // Вычисляем произведение первых двух положительных чисел
        int product = firstPositive * secondPositive;

        // Заменяем все нечётные элементы на произведение
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = product;
            }
        }

        // Выводим результат
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
