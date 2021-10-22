package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static double calculateEquation(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x / (1 + Math.pow(x * y, 2))))) + x;
    }

    private static boolean isPointInArea(Point point) {
        return (point.x >= -4 && point.x <= -4 && point.y >= 0 && point.y <= 5) ||
                (point.x >= -6 && point.x <= 6 && point.y >= -3 && point.y <= 0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculateEquation(scanner.nextDouble(), scanner.nextDouble()));
        ArrayExtensions.print(Func.calculateTg(0, 1, 0.1));
        ArrayExtensions.print(ArrayExtensions.returnPrimeNumbers(ArrayExtensions.createRange(2, 100)));
        System.out.println("task 5: " + ArrayExtensions.task5(new int[]{ 1, 3, 5, 2, 4 }));
        ArrayExtensions.print(ArrayExtensions.createMatrix(new double[]{ 0, 1, 2, 3, 4 }));
        ArrayExtensions.print(ArrayExtensions.sort(new double[]{ 3, 4, 2, 1, 5, 0, 10, -1 }));
        ArrayExtensions.print(ArrayExtensions.task8(new double[]{ 1, 3, 5, 7, 9 }, new double[] {0, 2, 4, 6, 8, 10, 12, 14 }));
    }
}
