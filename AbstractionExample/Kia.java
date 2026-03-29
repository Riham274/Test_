package AbstractionExample;

public class Kia extends Car {

    @Override
    void autoPilot() {
        System.out.println("Kia has auto-pilot feature.");
    }

    @Override
    void steering() {
        System.out.println("Kia has power steering.");
    }

    @Override
    void parkingSensor() {
        System.out.println("Kia has parking sensors.");
    }
    void fun1(){
        System.out.println("This is a non-abstract method in Kia class.");
    }

    @Override
    double calculatePrice() {
        return 8000.0; 
    }
}
