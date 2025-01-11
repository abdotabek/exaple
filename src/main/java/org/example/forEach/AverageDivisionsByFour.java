package org.example.forEach;

/**
 * Определить в нем среднее геометрическое тех элементов, которые
 * при делении на 4 дают остаток 1 или 3
 */
public class AverageDivisionsByFour {
    public static void main(String[] args) {
        int[] array = {4, 3, 5, 2, 4, 6};
        int countDivisionFour = 0;
        int performance = 1;
        for (int num : array) {
            if (num % 4 == 1 || num % 4 == 3) {
                performance *= num;
                countDivisionFour++;
            }
        }
        if (countDivisionFour > 0) {
            double geometricMean = Math.pow(performance, 1.0 / countDivisionFour);
            System.out.println("geometric mean numbers : " + geometricMean);
        } else {
            System.out.println("element from array does not exist!");
        }
    }
}
