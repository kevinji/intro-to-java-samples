package helloworld;

import java.util.Arrays;

/**
 * A series of useful array functions.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class ArrayFuncs {
    public static double max(double[] array) {
        double max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
    
    public static double min(double[] array) {
        double min = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static double sum(double[] array) {
        double sum = 0;
        
        for (double element : array) {
            sum += element;
        }
        
        return sum;
    }
    
    public static double[] concatenate(double[] array1, double[] array2) {
        double[] newArray = new double[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            // Shift to account for the elements already in newArray
            newArray[array1.length + i] = array2[i];
        }
        
        return newArray;
    }
    
    public static double[] reverse(double[] array) {
        int length = array.length;
        double[] newArray = new double[length];
        
        for (int i = 0; i < length; i++) {
            newArray[length - i - 1] = array[i];
        }
        
        return newArray;
    }
    
    public static void reverseInPlace(double[] array) {
        int stopIndex = array.length / 2 - 1;
        
        for (int i = 0; i <= stopIndex; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        double[] array = {2.3, -1.4, 5.9, 6.2, 0, -3.5, 4.2};
        System.out.println("Maximum: " + max(array)); // 6.2
        System.out.println("Minimum: " + min(array)); // -3.5
        System.out.println("Sum: " + sum(array)); // 13.7
        
        System.out.println("Reversed: " + Arrays.toString(reverse(array)));
        // [4.2, -3.5, 0.0, 6.2, 5.9, -1.4, 2.3]
        
        reverseInPlace(array);
        System.out.println("Reversed in place: " + Arrays.toString(array));
    }
}
