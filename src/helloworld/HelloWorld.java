package helloworld;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Hello world!
 * @author Kevin Ji
 */
public class HelloWorld {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        
        if (5 <= hour && hour < 12) {
            System.out.println("Good morning!");
        } else if (hour == 12) {
            System.out.println("Noon time!");
        } else if (12 < hour && hour < 17) {
            System.out.println("Good afternoon!");
        } else if (17 <= hour && hour < 19) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
        
        int[][] chessBoard = new int[8][];
        
        Book harryPotterBook = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2005);
        Book harryPotterBook2 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2005);
        Book orwellBook = new Book("1984", "George Orwell", 1949);
        
        System.out.println(harryPotterBook.equals(orwellBook));
        System.out.println(harryPotterBook.equals(harryPotterBook2));
        
        DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;
        
        if (dayOfWeek == DayOfWeek.MONDAY) {
            System.out.println("Today is Monday!");
        } else {
            System.out.println("Today is not Monday :(");
        }
        
        int[] cubes = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            cubes[i] = (int) Math.pow(i + 1, 3);
            sum += cubes[i];
        }
        
        System.out.println(Arrays.toString(cubes));
        System.out.println(sum);
    }
}
