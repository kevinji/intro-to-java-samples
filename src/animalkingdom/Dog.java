package animalkingdom;

public class Dog extends Mammal implements Predator, Carnivore, Scavenger {
    public Dog() {}
    
    @Override
    public void speak() {
        System.out.println("The dog says \"bark.\"");
    }
    
    @Override
    public void hunt() {}
    
    @Override
    public void eat(Object freshMeat) {}
    
    @Override
    public void eat(Object carrion, boolean tooOld) {
        if (tooOld) {
            // Don't eat!
        } else {
            // Munch away
        }
    }
}
