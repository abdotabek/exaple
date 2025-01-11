package org.example.forEach;

import java.util.Random;

/**
 * .Инициализировать массивы x, y из n чисел случайными
 * значениями. Понимая, что x[i], y[i] обозначают координаты
 * точек на плоскости, определить минимальный радиус круга, в
 * который попадают все эти точки.
 */
public class Radius {
    public static void main(String[] args) {
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            x[i] = random.nextInt(21) - 10;
            y[i] = random.nextInt(21) - 10;
        }
        double maxDistance = 0;

        for (int i = 0; i < n; i++) {
            double distance = Math.sqrt(x[i] * x[i] + y[i] * y[i]);
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        System.out.println("coordinates of points : ");
        for (int i = 0; i < n; i++) {
            System.out.println("(" + x[i] + "," + y[i] + ")");
        }
        System.out.println("minimal radius of the circle : " + maxDistance);

    }
}
