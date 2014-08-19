package animalkingdom;

public class AnimalKingdom {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        
        // Let the animals speak
        cat.speak();
        dog.speak();
        mouse.speak();
    }
}
