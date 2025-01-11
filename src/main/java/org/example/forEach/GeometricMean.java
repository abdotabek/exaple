package org.example.forEach;

/**
 * Найти среднее геометрическое значение для массива и вернуть в
 * качестве возвращаемого значения количество элементов, меньших
 * среднего геометрического.
 */
public class GeometricMean {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        // нашел произведение всех элементов
        double product = 1;
        for (int num : array) {
            product *= num;
        }
        double geometricMean = Math.pow(product, (double) 1 / n);

        int count = 0;
        for (int num : array) {
            if (num < geometricMean) {
                count++;
            }
        }
        System.out.println("geometric mean : " + geometricMean);
        System.out.println("count : " + count);
    }
}
