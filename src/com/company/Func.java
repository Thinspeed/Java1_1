package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Func {

    public static double[] calculateTg(double left, double right, double interval) {
        if ((left > right && interval > 0) || (left < right && interval < 0) || (interval == 0)) {
            return new double[0];
        }

        double[] result = new double[8];
        int count = 0;
        double x = left;
        while (x <= right) {
            if (count == result.length) {
                result = extendArray(result);
            }

            result[count] = Math.tan(x);
            count += 1;
            x += interval;
        }

        return Arrays.copyOfRange(result, 0, count);
    }

    private static double[] extendArray(double[] array) {
        double[] newArray = new double[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
