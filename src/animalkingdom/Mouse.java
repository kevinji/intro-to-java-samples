package animalkingdom;

public class Mouse extends Mammal implements Herbivore {
    public Mouse() {}
    
    @Override
    public void speak() {
        System.out.println("The mouse says \"squeak.\"");
    }
    
    @Override
    public void eat(Object plantMatter) {}
}
