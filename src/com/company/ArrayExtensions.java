package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExtensions {

    //task 4
    public static int[] returnPrimeNumbers(int[] array) {
        int[] result = new int[8];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                if (count == result.length) {
                    result = extendArray(result);
                }

                result[count] = i;
                count += 1;
            }
        }

        return Arrays.copyOfRange(result, 0, count);
    }

    //task5
    public static int task5(int[] array) {
        return task5(array, array.length);
    }

    private static int task5(int[] array, int count) {
        if (count == 0) {
            return 0;
        }

        int deletedElements = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tempLeft = array[i];
                int tempRight = array[i + 1];
                array[i] = tempRight;
                int left = task5(array, count - 1);
                array[i] = tempLeft;
                array[i + 1] = tempLeft;
                int right = task5(array, count - 1);
                if (left <= right) {
                    array[i + 1] = tempLeft;
                    deletedElements += left;
                }
                else {
                    array[i] = tempRight;
                    deletedElements += right;
                }

                deletedElements++;
            }
        }

        return deletedElements;
    }

    //task 6
    public static double[][] createMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(i + j) % array.length];
            }
        }

        return matrix;
    }

    //task 7
    public static double[] sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    //task 8
    public static int[] task8 (double[] a, double[] b) {
        int[] indeces = new int[b.length];
        int lastIndex = 0;
        for (int i = 0; i < b.length; i++) {
            while (lastIndex < a.length && b[i] > a[lastIndex]) {
                lastIndex++;
            }

            indeces[i] = lastIndex;
        }

        return indeces;
    }

    public static int[] createRange(int left, int right) {
        int[] array = new int[right - left + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = left + i;
        }

        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void  print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    private static int[] extendArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
