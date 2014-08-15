package helloworld;

/**
 *
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
    
    public static void main(String[] args) {
        double[] array = {2.3, -1.4, 5.9, 6.2, 0, -3.5};
        System.out.println("Maximum: " + max(array)); // 6.2
        System.out.println("Minimum: " + min(array)); // -3.5
    }
}
