package multipledicerolls;

/**
 * Simulate multiple dice rolls.
 * @author Kevin Ji
 */
public class MultipleDiceRolls {
    public static void main(String[] args) {
        final int SIDES = 6;
        final int DIE_ROLLS_COUNT = 100;
        
        int[] dieRolls = new int[SIDES];
        
        for (int i = 0; i < DIE_ROLLS_COUNT; i++) {
            int dieRoll = getRandomDieRoll();
            
            dieRolls[dieRoll - 1]++;
        }
        
        for (int i = 0; i < SIDES; i++) {
            System.out.println("A " + (i + 1) + " has been rolled " +
                    dieRolls[i] + " times.");
        }
    }
    
    private static int getRandomDieRoll() {
        return (int)(6 * Math.random()) + 1;
    }
}
