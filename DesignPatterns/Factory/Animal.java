package DesignPatterns.Factory;
// Simple Factory Pattern 
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }
}

// Factory Method Pattern
abstract class AnimalCreator {
    abstract Animal createAnimal();
}

class DogCreator extends AnimalCreator {
    Animal createAnimal() {
        return new Dog();
    }
}

class CatCreator extends AnimalCreator {
    Animal createAnimal() {
        return new Cat();
    }
}