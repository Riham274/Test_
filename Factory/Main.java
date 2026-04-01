package Factory;

public class Main {
    public static void main(String[] args) {
        // Simple Factory Pattern
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.makeSound();

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.makeSound();

        // Factory Method Pattern
        AnimalCreator dogCreator = new DogCreator();
        Animal dog2 = dogCreator.createAnimal();
        dog2.makeSound();

        // factory method 2
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }
}
