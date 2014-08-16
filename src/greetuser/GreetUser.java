package greetuser;

import java.util.Scanner;

/**
 * Greet the user.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class GreetUser {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        
        System.out.println("Hello, " + name + "!");
    }
}
