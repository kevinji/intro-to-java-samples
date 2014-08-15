package helloworld;

import java.util.Scanner;

/**
 *
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class SumNumber {
    public static void main(String[] args) {      
        System.out.println("Enter your number:");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum + ".");
    }
}
