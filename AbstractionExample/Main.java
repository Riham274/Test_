package AbstractionExample;

public class Main {
    /* 
    static void fun1 (Kia obj){
        obj.autoPilot();
    }

    static void fun2 (BMW obj){
        obj.autoPilot();
    }
    */
    /*create a generic function for any car (polymorphism)*/
    /*one method for all sub classes from abstract class(car) */
    static void fun (Car obj){
        obj.autoPilot();
    }
    public static void main(String[] args) {
        /*
         fun1(new Kia()); 
         fun2(new BMW()); 
        */
        fun(new Kia());

        /*Example1: Create a BMW and Kia car and demonstrate their features */
        
        Car bmw = new BMW();
        bmw.autoPilot();
        bmw.steering();
        bmw.parkingSensor();
        System.out.println("BMW Price: $" + bmw.calculatePrice());
        

        Car kia = new Kia();
        kia.autoPilot();
        kia.steering();
        kia.parkingSensor();
        System.out.println("Kia Price: $" + kia.calculatePrice());
       
        
        /*error because fun1 is not a method of Car class, it's a method of Kia class */
        // kia.fun1();
        Kia kia2 = new Kia();
        kia2.fun1();
    
        /* Car is an abstract class, we cannot create an instance of it */
        /* Car car1 = new Car(); */ // This will cause a compilation error


        interface Flyable {
            void fly();
        }

        class Bird implements Flyable {
            @Override
            public void fly() {
                System.out.println("The bird is flying.");
            }
        }

        class Airplane implements Flyable {
            @Override
            public void fly() {
                System.out.println("The airplane is flying.");
            }
        }


        Flyable bird = new Bird();
        bird.fly();
        Flyable airplane = new Airplane();
        airplane.fly();
    }
}
