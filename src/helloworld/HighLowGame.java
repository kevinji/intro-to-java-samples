package helloworld;

import java.util.Scanner;

/**
 * Let's play a high/low game!
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class HighLowGame {
    private final int initialNum = (int)(Math.random() * 100) + 1;
    
    public void play() {
        System.out.println("Let's play a high/low game!");
        
        int guess = 0;
        int guessCount = 0;
        
        while (guess != initialNum) {
            guess = promptForGuess();
            guessCount++;
            
            if (guess < initialNum) {
                System.out.println("Higher...");
            } else if (guess > initialNum) {
                System.out.println("Lower...");
            } else {
                System.out.println("You got it!");
                System.out.println("You took " + guessCount + " guesses.");
                break;
            }
        }
    }
    
    private static int promptForGuess() {
        System.out.println("Guess a number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        HighLowGame game = new HighLowGame();
        game.play();
    }
}
