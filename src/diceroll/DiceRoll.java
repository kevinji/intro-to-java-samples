package diceroll;

/**
 * Simulate a dice roll.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class DiceRoll {
    public static void main(String[] args) {
        int randomDieRoll = getRandomDieRoll();
        
        System.out.println("You rolled a: " + randomDieRoll);
        
        if (randomDieRoll % 2 == 1) {
            System.out.println("Winner!");
        } else {
            System.out.println("Try again.");
        }
    }
    
    private static int getRandomDieRoll() {
        return (int)(6 * Math.random()) + 1;
    }
}
