package Interface;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal Scoopy = new Cat();
        Animal Kane = new Dog();
        Scoopy.eat();
        Scoopy.sleep();
        Scoopy.makeSound();
        Kane.eat();
        Kane.sleep();
        Kane.makeSound();
        
    }
}