package helloworld;

import java.util.Scanner;

/**
 * Let's play a high/low game (standalone)!
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class HighLowGameStandalone {
    public static void main(String[] args) {
        System.out.println("Let's play a high/low game!");
        
        final int initialNum = (int)(Math.random() * 100) + 1;
        int guess = 0;
        
        while (guess != initialNum) {
            guess = promptForGuess();
            
            if (guess < initialNum) {
                System.out.println("Higher...");
            } else if (guess > initialNum) {
                System.out.println("Lower...");
            } else {
                System.out.println("You got it!");
                break;
            }
        }
    }
    
    private static int promptForGuess() {
        System.out.println("Guess a number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
