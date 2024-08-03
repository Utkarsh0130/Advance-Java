// This program demonstrates the use of interfaces in Java

// Interface
interface Animal {
    void makeSound();
    void eat();
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
