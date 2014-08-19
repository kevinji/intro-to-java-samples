package animalkingdom;

public class Cat extends Mammal implements Predator, Carnivore {
    private static int numberOfCats;
    
    public Cat() {
        numberOfCats++;
    }
    
    public static final int getNumberOfCats() {
        return numberOfCats;
    }
    
    @Override
    protected void sayWhatIAm() {
        System.out.println("I am a cat");
        super.sayWhatIAm();
    }
    
    @Override
    public void speak() {
        System.out.println("The cat says \"meow.\"");
    }
    
    /**
     * Chase a mouse.
     * @param mouse 
     */
    public void chase(Mouse mouse) {}
    
    /**
     * Chase one's tail.
     * @param tail 
     */
    public void chase(Object tail) {}
    
    @Override
    public void hunt() {}
    
    @Override
    public void eat(Object freshMeat) {}
}
