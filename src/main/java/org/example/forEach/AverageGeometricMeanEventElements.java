package org.example.forEach;

/**
 * Определить в нем среднее геометрическое четных элементов.
 */
public class AverageGeometricMeanEventElements {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 8, 4};
        int performanceEventElements = 1;
        int countEventElements = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                performanceEventElements *= num;
                countEventElements++;
            }
        }
        if (countEventElements > 1) {
            double geometricMean = Math.pow(performanceEventElements, 1.0 / countEventElements);
            System.out.println("Geometric mean of even numbers : " + geometricMean);
        } else {
            System.out.println("no event numbers in the array.");
        }
    }
}
