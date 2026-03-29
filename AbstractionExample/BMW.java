package AbstractionExample;

public class BMW extends Car {

    @Override
    void autoPilot() {
        System.out.println("BMW has auto-pilot feature.");
    }

    @Override
    void steering() {
        System.out.println("BMW has power steering.");
    }

    @Override
    void parkingSensor() {
        System.out.println("BMW has parking sensors.");
    }

    @Override
    double calculatePrice() {
        return 20000.0; 
    }
    
}
